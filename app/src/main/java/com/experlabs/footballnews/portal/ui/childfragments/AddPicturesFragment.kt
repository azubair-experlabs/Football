package com.experlabs.footballnews.portal.ui.childfragments

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.PixelCopy
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentAddpicturesBinding
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope


class AddPicturesFragment : Fragment(), AndroidScopeComponent {

    private var bitmap: Bitmap? = null
    private var _binding: FragmentAddpicturesBinding? = null

    private val binding get() = _binding!!

    override val scope : Scope by fragmentScope()
    private val viewModel by inject<PortalViewModel>()

    private var is_selected = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAddpicturesBinding.inflate(inflater, container, false)

        val selectImage = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback { uri ->
                is_selected = true
                bitmap = uri?.let { getCapturedImage(it) }
                binding.imageUploadBt.visibility = View.VISIBLE
                binding.uploadImageView.setImageURI(uri)
            }
        )

        binding.selectImageBt.setOnClickListener {
            selectImage.launch("image/*")
        }


        return binding.root
    }

    private fun getCapturedImage(selectedPhotoUri: Uri): Bitmap {
        val bitmap = when {
            Build.VERSION.SDK_INT < 28 -> MediaStore.Images.Media.getBitmap(
                requireContext().contentResolver,
                selectedPhotoUri
            )
            else -> {
                val source = ImageDecoder.createSource(requireContext().contentResolver, selectedPhotoUri)
                return ImageDecoder.decodeBitmap(source)
            }
        }
        return bitmap
    }

    private fun getBitmapFromView(view: View, activity: Activity?, callback: (Bitmap) -> Unit) {
        activity?.window?.let { window ->
            val bitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
            val locationOfViewInWindow = IntArray(2)
            view.getLocationInWindow(locationOfViewInWindow)
            try {
                PixelCopy.request(
                    window,
                    Rect(locationOfViewInWindow[0], locationOfViewInWindow[1], locationOfViewInWindow[0] + view.width, locationOfViewInWindow[1] + view.height),
                    bitmap,
                    { copyResult ->
                        if (copyResult == PixelCopy.SUCCESS) {
                            callback(bitmap)
                        }
                    },
                    Handler(Looper.getMainLooper())
                )

            } catch (e: IllegalArgumentException) {
                Toast.makeText(view.context, "Error in getting bitmap", Toast.LENGTH_SHORT).show()
                e.printStackTrace()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.imageUploadBt.setOnClickListener {
                if (binding.imageNameText.text.isNotEmpty() && is_selected) {
                    viewModel.postPictureInRepository(
                        binding.imageNameText.text.toString(),
                        bitmap!!
                    ) { flag, message ->
                        if (flag) {
                            is_selected = false
                            binding.imageUploadBt.visibility = View.GONE
                            binding.uploadImageView.setImageResource(R.drawable.ic_gallery)
                            binding.imageNameText.text.clear()
                        }
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(view.context, "Please enter a name and select a image!", Toast.LENGTH_SHORT)
                        .show()
                }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
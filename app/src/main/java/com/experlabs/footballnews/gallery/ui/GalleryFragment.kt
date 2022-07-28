package com.experlabs.footballnews.gallery.ui

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentGalleryBinding
import com.experlabs.footballnews.databinding.GalleryPopupBinding
import com.experlabs.footballnews.gallery.viewmodels.GalleryViewModel
import com.experlabs.footballnews.portal.models.Picture
import com.squareup.picasso.Picasso
import com.squareup.picasso.Picasso.LoadedFrom
import com.squareup.picasso.Target
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope
import java.lang.Exception


class GalleryFragment : Fragment(), AndroidScopeComponent {

    private var _binding: FragmentGalleryBinding? = null

    override val scope : Scope by fragmentScope()
    private val viewModel by inject<GalleryViewModel>()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)

        activity?.setTitle(R.string.title_gallery)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()

        binding.refreshGalleryBt.setOnRefreshListener {
            loadData()
        }
    }

    private fun loadData(){
        viewModel.getPicturesFromRepository { flag, message ->
            try {
                if (flag) {
                    viewModel.pictures.observe(viewLifecycleOwner) {
                        binding.galleryRecycler.adapter = GalleryAdapter(it) { item, index ->
                            openImage(item, index)
                        }
                    }
                } else
                    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

                binding.refreshGalleryBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("Gallery crash", e.toString())
            }
        }
    }

    private fun openImage(item: Picture, index: Int) {
        val saveDialog = Dialog(requireContext())
        val popupBinding = GalleryPopupBinding.inflate(LayoutInflater.from(context))

        var image : Bitmap? = null

        Picasso.get().load(item.path).into(object : Target {
                override fun onBitmapLoaded(bitmap: Bitmap?, from: LoadedFrom?) {
                    image = bitmap
                    popupBinding.popupImageView.setImageBitmap(bitmap)
                    popupBinding.popupsaveBt.isEnabled = true

                }
                override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}
                override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}
            }
        )

        popupBinding.popupcloseBt.setOnClickListener {
            saveDialog.hide()
        }

        popupBinding.popupsaveBt.setOnClickListener {
            image?.let {
                viewModel.savePictureInRepository(item.name, image!!){ flag, message ->
                    if (flag){
                        saveDialog.hide()
                        Toast.makeText(view?.context, message, Toast.LENGTH_SHORT).show()
                    }
                    else
                        Toast.makeText(view?.context, message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        saveDialog.setContentView(popupBinding.root)
        saveDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        saveDialog.show()
    }

    override fun onStop() {
        super.onStop()
        this.viewModel.pictures.removeObservers(viewLifecycleOwner)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
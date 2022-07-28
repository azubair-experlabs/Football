package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GalleryItemBindingImpl extends GalleryItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GalleryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private GalleryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.galleryImageView.setTag(null);
        this.galleryText.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gallery_item == variableId) {
            setGalleryItem((com.experlabs.footballnews.portal.models.Picture) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGalleryItem(@Nullable com.experlabs.footballnews.portal.models.Picture GalleryItem) {
        this.mGalleryItem = GalleryItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gallery_item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.experlabs.footballnews.portal.models.Picture galleryItem = mGalleryItem;
        java.lang.String galleryItemName = null;
        java.lang.String galleryItemPath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (galleryItem != null) {
                    // read gallery_item.name
                    galleryItemName = galleryItem.getName();
                    // read gallery_item.path
                    galleryItemPath = galleryItem.getPath();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.galleryImageView, galleryItemPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.galleryText, galleryItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gallery_item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
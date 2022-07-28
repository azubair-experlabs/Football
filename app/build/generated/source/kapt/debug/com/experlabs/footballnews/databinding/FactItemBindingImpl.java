package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FactItemBindingImpl extends FactItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.share_bt, 4);
        sViewsWithIds.put(R.id.open_bt, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FactItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FactItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.factImageView.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.titleText.setTag(null);
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
        if (BR.factItem == variableId) {
            setFactItem((com.experlabs.footballnews.portal.models.News) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFactItem(@Nullable com.experlabs.footballnews.portal.models.News FactItem) {
        this.mFactItem = FactItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.factItem);
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
        java.lang.String factItemTitle = null;
        java.lang.String factItemDescription = null;
        java.lang.String factItemUrl = null;
        com.experlabs.footballnews.portal.models.News factItem = mFactItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (factItem != null) {
                    // read factItem.title
                    factItemTitle = factItem.getTitle();
                    // read factItem.description
                    factItemDescription = factItem.getDescription();
                    // read factItem.url
                    factItemUrl = factItem.getUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.factImageView, factItemUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, factItemDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, factItemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): factItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
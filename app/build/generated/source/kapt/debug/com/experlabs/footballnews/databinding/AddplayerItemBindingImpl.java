package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddplayerItemBindingImpl extends AddplayerItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view2, 3);
        sViewsWithIds.put(R.id.removePlayer_bt, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddplayerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AddplayerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[3]
            );
        this.imageView1.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.removeNameText.setTag(null);
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
        if (BR.player_item == variableId) {
            setPlayerItem((com.experlabs.footballnews.portal.models.Player) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlayerItem(@Nullable com.experlabs.footballnews.portal.models.Player PlayerItem) {
        this.mPlayerItem = PlayerItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.player_item);
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
        java.lang.String playerItemName = null;
        java.lang.String playerItemPictureUrl = null;
        com.experlabs.footballnews.portal.models.Player playerItem = mPlayerItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (playerItem != null) {
                    // read player_item.name
                    playerItemName = playerItem.getName();
                    // read player_item.picture_url
                    playerItemPictureUrl = playerItem.getPicture_url();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.imageView1, playerItemPictureUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.removeNameText, playerItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): player_item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
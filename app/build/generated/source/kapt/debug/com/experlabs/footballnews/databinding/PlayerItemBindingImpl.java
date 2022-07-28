package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlayerItemBindingImpl extends PlayerItemBinding  {

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
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlayerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PlayerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.playerItem == variableId) {
            setPlayerItem((com.experlabs.footballnews.portal.models.Player) variable);
        }
        else if (BR.index == variableId) {
            setIndex((java.lang.String) variable);
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
        notifyPropertyChanged(BR.playerItem);
        super.requestRebind();
    }
    public void setIndex(@Nullable java.lang.String Index) {
        this.mIndex = Index;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.index);
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
        java.lang.String playerItemMatchesPlayed = null;
        java.lang.String playerItemTotalGoals = null;
        java.lang.String playerItemPictureUrl = null;
        com.experlabs.footballnews.portal.models.Player playerItem = mPlayerItem;
        java.lang.String index = mIndex;

        if ((dirtyFlags & 0x5L) != 0) {



                if (playerItem != null) {
                    // read playerItem.name
                    playerItemName = playerItem.getName();
                    // read playerItem.matches_played
                    playerItemMatchesPlayed = playerItem.getMatches_played();
                    // read playerItem.total_goals
                    playerItemTotalGoals = playerItem.getTotal_goals();
                    // read playerItem.picture_url
                    playerItemPictureUrl = playerItem.getPicture_url();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, index);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.mboundView2, playerItemPictureUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, playerItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, playerItemMatchesPlayed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, playerItemTotalGoals);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): playerItem
        flag 1 (0x2L): index
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TeamItemBindingImpl extends TeamItemBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TeamItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private TeamItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.index == variableId) {
            setIndex((java.lang.String) variable);
        }
        else if (BR.teamItem == variableId) {
            setTeamItem((com.experlabs.footballnews.portal.models.Team) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndex(@Nullable java.lang.String Index) {
        this.mIndex = Index;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.index);
        super.requestRebind();
    }
    public void setTeamItem(@Nullable com.experlabs.footballnews.portal.models.Team TeamItem) {
        this.mTeamItem = TeamItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.teamItem);
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
        java.lang.String teamItemPoints = null;
        java.lang.String index = mIndex;
        java.lang.String teamItemName = null;
        java.lang.String teamItemFlagUrl = null;
        com.experlabs.footballnews.portal.models.Team teamItem = mTeamItem;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (teamItem != null) {
                    // read teamItem.points
                    teamItemPoints = teamItem.getPoints();
                    // read teamItem.name
                    teamItemName = teamItem.getName();
                    // read teamItem.flag_url
                    teamItemFlagUrl = teamItem.getFlag_url();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, index);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.mboundView2, teamItemFlagUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, teamItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, teamItemPoints);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): index
        flag 1 (0x2L): teamItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
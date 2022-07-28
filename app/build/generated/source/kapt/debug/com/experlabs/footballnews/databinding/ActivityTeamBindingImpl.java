package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTeamBindingImpl extends ActivityTeamBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player_card, 7);
        sViewsWithIds.put(R.id.teamPlayers_recycler, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTeamBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityTeamBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[2]
            );
        this.editTextTextMultiLine.setTag(null);
        this.imageView2.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.textView.setTag(null);
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
        if (BR.teamItem == variableId) {
            setTeamItem((com.experlabs.footballnews.portal.models.Team) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTeamItem(@Nullable com.experlabs.footballnews.portal.models.Team TeamItem) {
        this.mTeamItem = TeamItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.lang.String teamItemDescription = null;
        java.lang.String javaLangStringCountryTeamItemCountry = null;
        java.lang.String javaLangStringTeamDescriptionNTeamItemDescription = null;
        java.lang.String teamItemPoints = null;
        java.lang.String javaLangStringPointsTeamItemPoints = null;
        java.util.ArrayList<com.experlabs.footballnews.portal.models.Player> teamItemTeam = null;
        int teamItemTeamSize = 0;
        java.lang.String teamItemName = null;
        java.lang.String javaLangStringTeamSizeTeamItemTeamSize = null;
        java.lang.String teamItemCountry = null;
        java.lang.String teamItemFlagUrl = null;
        com.experlabs.footballnews.portal.models.Team teamItem = mTeamItem;

        if ((dirtyFlags & 0x3L) != 0) {



                if (teamItem != null) {
                    // read teamItem.description
                    teamItemDescription = teamItem.getDescription();
                    // read teamItem.points
                    teamItemPoints = teamItem.getPoints();
                    // read teamItem.team
                    teamItemTeam = teamItem.getTeam();
                    // read teamItem.name
                    teamItemName = teamItem.getName();
                    // read teamItem.country
                    teamItemCountry = teamItem.getCountry();
                    // read teamItem.flag_url
                    teamItemFlagUrl = teamItem.getFlag_url();
                }


                // read ("Team Description:\n") + (teamItem.description)
                javaLangStringTeamDescriptionNTeamItemDescription = ("Team Description:\n") + (teamItemDescription);
                // read ("Points: ") + (teamItem.points)
                javaLangStringPointsTeamItemPoints = ("Points: ") + (teamItemPoints);
                // read ("Country: ") + (teamItem.country)
                javaLangStringCountryTeamItemCountry = ("Country: ") + (teamItemCountry);
                if (teamItemTeam != null) {
                    // read teamItem.team.size()
                    teamItemTeamSize = teamItemTeam.size();
                }


                // read ("Team Size: ") + (teamItem.team.size())
                javaLangStringTeamSizeTeamItemTeamSize = ("Team Size: ") + (teamItemTeamSize);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextTextMultiLine, javaLangStringTeamDescriptionNTeamItemDescription);
            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.imageView2, teamItemFlagUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringCountryTeamItemCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, javaLangStringPointsTeamItemPoints);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, javaLangStringTeamSizeTeamItemTeamSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, teamItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): teamItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
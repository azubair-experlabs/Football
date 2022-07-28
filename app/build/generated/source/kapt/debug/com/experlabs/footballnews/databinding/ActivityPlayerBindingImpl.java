package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPlayerBindingImpl extends ActivityPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 10);
        sViewsWithIds.put(R.id.player_card, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.TextView) bindings[2]
            );
        this.editTextTextMultiLine.setTag(null);
        this.imageView2.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
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
        if (BR.playerItem == variableId) {
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
        notifyPropertyChanged(BR.playerItem);
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
        java.lang.String playerItemDescription = null;
        java.lang.String playerItemName = null;
        java.lang.String javaLangStringCountryPlayerItemNationality = null;
        java.lang.String javaLangStringGoalsPlayerItemTotalGoals = null;
        java.lang.String playerItemPenaltyKicks = null;
        java.lang.String javaLangStringAssistsPlayerItemTotalAssists = null;
        java.lang.String playerItemNationality = null;
        java.lang.String playerItemPictureUrl = null;
        java.lang.String playerItemTotalAssists = null;
        java.lang.String javaLangStringDescriptionNPlayerItemDescription = null;
        com.experlabs.footballnews.portal.models.Player playerItem = mPlayerItem;
        java.lang.String javaLangStringPenaltyKicksPlayerItemPenaltyKicks = null;
        java.lang.String javaLangStringMatchesPlayerPlayerItemMatchesPlayed = null;
        java.lang.String playerItemTotalGoals = null;
        java.lang.String playerItemMatchesPlayed = null;
        java.lang.String playerItemNumber = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (playerItem != null) {
                    // read playerItem.description
                    playerItemDescription = playerItem.getDescription();
                    // read playerItem.name
                    playerItemName = playerItem.getName();
                    // read playerItem.penalty_kicks
                    playerItemPenaltyKicks = playerItem.getPenalty_kicks();
                    // read playerItem.nationality
                    playerItemNationality = playerItem.getNationality();
                    // read playerItem.picture_url
                    playerItemPictureUrl = playerItem.getPicture_url();
                    // read playerItem.total_assists
                    playerItemTotalAssists = playerItem.getTotal_assists();
                    // read playerItem.total_goals
                    playerItemTotalGoals = playerItem.getTotal_goals();
                    // read playerItem.matches_played
                    playerItemMatchesPlayed = playerItem.getMatches_played();
                    // read playerItem.number
                    playerItemNumber = playerItem.getNumber();
                }


                // read ("Description:\n") + (playerItem.description)
                javaLangStringDescriptionNPlayerItemDescription = ("Description:\n") + (playerItemDescription);
                // read ("Penalty kicks: ") + (playerItem.penalty_kicks)
                javaLangStringPenaltyKicksPlayerItemPenaltyKicks = ("Penalty kicks: ") + (playerItemPenaltyKicks);
                // read ("Country: ") + (playerItem.nationality)
                javaLangStringCountryPlayerItemNationality = ("Country: ") + (playerItemNationality);
                // read ("Assists: ") + (playerItem.total_assists)
                javaLangStringAssistsPlayerItemTotalAssists = ("Assists: ") + (playerItemTotalAssists);
                // read ("Goals: ") + (playerItem.total_goals)
                javaLangStringGoalsPlayerItemTotalGoals = ("Goals: ") + (playerItemTotalGoals);
                // read ("Matches Player: ") + (playerItem.matches_played)
                javaLangStringMatchesPlayerPlayerItemMatchesPlayed = ("Matches Player: ") + (playerItemMatchesPlayed);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextTextMultiLine, javaLangStringDescriptionNPlayerItemDescription);
            com.experlabs.footballnews.portal.ui.PlayersAdapterKt.imageFromURL(this.imageView2, playerItemPictureUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, playerItemNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringCountryPlayerItemNationality);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, javaLangStringAssistsPlayerItemTotalAssists);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, javaLangStringGoalsPlayerItemTotalGoals);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, javaLangStringMatchesPlayerPlayerItemMatchesPlayed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, javaLangStringPenaltyKicksPlayerItemPenaltyKicks);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, playerItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): playerItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
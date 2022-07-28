package com.experlabs.footballnews.portal.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B7\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/experlabs/footballnews/portal/ui/PlayersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/experlabs/footballnews/portal/ui/PlayersAdapter$ViewHolder;", "players", "Ljava/util/ArrayList;", "Lcom/experlabs/footballnews/portal/models/Player;", "Lkotlin/collections/ArrayList;", "deleteOnClick", "Lkotlin/Function2;", "", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;)V", "getDeleteOnClick", "()Lkotlin/jvm/functions/Function2;", "getItemCount", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class PlayersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.experlabs.footballnews.portal.ui.PlayersAdapter.ViewHolder> {
    private final java.util.ArrayList<com.experlabs.footballnews.portal.models.Player> players = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.experlabs.footballnews.portal.models.Player, java.lang.Integer, kotlin.Unit> deleteOnClick = null;
    
    public PlayersAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.experlabs.footballnews.portal.models.Player> players, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.experlabs.footballnews.portal.models.Player, ? super java.lang.Integer, kotlin.Unit> deleteOnClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.experlabs.footballnews.portal.models.Player, java.lang.Integer, kotlin.Unit> getDeleteOnClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.experlabs.footballnews.portal.ui.PlayersAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.portal.ui.PlayersAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/experlabs/footballnews/portal/ui/PlayersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/experlabs/footballnews/databinding/AddplayerItemBinding;", "(Lcom/experlabs/footballnews/portal/ui/PlayersAdapter;Lcom/experlabs/footballnews/databinding/AddplayerItemBinding;)V", "getBinding", "()Lcom/experlabs/footballnews/databinding/AddplayerItemBinding;", "bind", "", "item", "Lcom/experlabs/footballnews/portal/models/Player;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.experlabs.footballnews.databinding.AddplayerItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.experlabs.footballnews.databinding.AddplayerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.experlabs.footballnews.databinding.AddplayerItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.experlabs.footballnews.portal.models.Player item) {
        }
    }
}
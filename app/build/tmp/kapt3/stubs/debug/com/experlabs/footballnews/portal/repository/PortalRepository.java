package com.experlabs.footballnews.portal.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ+\u0010\u000e\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J3\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ;\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J3\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J3\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/experlabs/footballnews/portal/repository/PortalRepository;", "", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "messagingService", "Lcom/experlabs/footballnews/fcm/services/FirebaseMessagingService;", "(Lcom/google/firebase/database/FirebaseDatabase;Lcom/google/firebase/storage/FirebaseStorage;Lcom/experlabs/footballnews/fcm/services/FirebaseMessagingService;)V", "players", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/experlabs/footballnews/portal/models/Player;", "Lkotlin/collections/ArrayList;", "getPlayers", "()Landroidx/lifecycle/LiveData;", "playersLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "callback", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postNews", "news", "Lcom/experlabs/footballnews/portal/models/News;", "(Lcom/experlabs/footballnews/portal/models/News;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPicture", "bitmap", "Landroid/graphics/Bitmap;", "picture", "Lcom/experlabs/footballnews/portal/models/Picture;", "(Landroid/graphics/Bitmap;Lcom/experlabs/footballnews/portal/models/Picture;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPlayer", "player", "(Lcom/experlabs/footballnews/portal/models/Player;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postTeam", "team", "Lcom/experlabs/footballnews/portal/models/Team;", "(Lcom/experlabs/footballnews/portal/models/Team;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PortalRepository {
    private final com.google.firebase.database.FirebaseDatabase database = null;
    private final com.google.firebase.storage.FirebaseStorage storage = null;
    private final com.experlabs.footballnews.fcm.services.FirebaseMessagingService messagingService = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.experlabs.footballnews.portal.models.Player>> playersLiveData = null;
    
    public PortalRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase database, @org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.FirebaseStorage storage, @org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.fcm.services.FirebaseMessagingService messagingService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.experlabs.footballnews.portal.models.Player>> getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postNews(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.portal.models.News news, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postTeam(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.portal.models.Team team, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postPlayer(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.portal.models.Player player, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postPicture(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.portal.models.Picture picture, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPlayers(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
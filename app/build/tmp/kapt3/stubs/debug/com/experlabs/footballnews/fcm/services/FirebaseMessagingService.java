package com.experlabs.footballnews.fcm.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\bJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/experlabs/footballnews/fcm/services/FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "builder", "Landroid/app/Notification$Builder;", "channel", "", "db", "getDb", "()Lcom/google/firebase/database/FirebaseDatabase;", "description", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "addTokenToFirestore", "", "newRegistrationToken", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "p0", "postNotification", "Lkotlinx/coroutines/Job;", "token", "news", "sendNotification", "body", "title", "app_debug"})
public final class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final com.google.firebase.database.FirebaseDatabase database = null;
    private android.app.Notification.Builder builder;
    private final java.lang.String channel = "Football-Notifications";
    private final java.lang.String description = "footballNotifications";
    public android.content.Intent intent;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.database.FirebaseDatabase db = null;
    
    public FirebaseMessagingService(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getIntent() {
        return null;
    }
    
    public final void setIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.FirebaseDatabase getDb() {
        return null;
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void addTokenToFirestore(@org.jetbrains.annotations.Nullable()
    java.lang.String newRegistrationToken) {
    }
    
    public final void sendNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String news) {
    }
    
    private final kotlinx.coroutines.Job postNotification(java.lang.String token, java.lang.String news) {
        return null;
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    public final void sendNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
}
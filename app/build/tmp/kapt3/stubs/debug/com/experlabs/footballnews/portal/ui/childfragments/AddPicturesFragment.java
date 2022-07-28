package com.experlabs.footballnews.portal.ui.childfragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0 H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0002J$\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\u001a\u0010,\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lcom/experlabs/footballnews/portal/ui/childfragments/AddPicturesFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/android/scope/AndroidScopeComponent;", "()V", "_binding", "Lcom/experlabs/footballnews/databinding/FragmentAddpicturesBinding;", "binding", "getBinding", "()Lcom/experlabs/footballnews/databinding/FragmentAddpicturesBinding;", "bitmap", "Landroid/graphics/Bitmap;", "is_selected", "", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope$delegate", "Lorg/koin/androidx/scope/LifecycleScopeDelegate;", "viewModel", "Lcom/experlabs/footballnews/portal/viewmodels/PortalViewModel;", "getViewModel", "()Lcom/experlabs/footballnews/portal/viewmodels/PortalViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getBitmapFromView", "", "view", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "getCapturedImage", "selectedPhotoUri", "Landroid/net/Uri;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "app_debug"})
public final class AddPicturesFragment extends androidx.fragment.app.Fragment implements org.koin.android.scope.AndroidScopeComponent {
    private android.graphics.Bitmap bitmap;
    private com.experlabs.footballnews.databinding.FragmentAddpicturesBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final org.koin.androidx.scope.LifecycleScopeDelegate scope$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean is_selected = false;
    
    public AddPicturesFragment() {
        super();
    }
    
    private final com.experlabs.footballnews.databinding.FragmentAddpicturesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.koin.core.scope.Scope getScope() {
        return null;
    }
    
    private final com.experlabs.footballnews.portal.viewmodels.PortalViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final android.graphics.Bitmap getCapturedImage(android.net.Uri selectedPhotoUri) {
        return null;
    }
    
    private final void getBitmapFromView(android.view.View view, android.app.Activity activity, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}
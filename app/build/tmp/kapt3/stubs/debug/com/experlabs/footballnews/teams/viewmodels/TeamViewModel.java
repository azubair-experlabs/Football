package com.experlabs.footballnews.teams.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000fJ2\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00112\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/experlabs/footballnews/teams/viewmodels/TeamViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/experlabs/footballnews/teams/repository/TeamRepository;", "(Lcom/experlabs/footballnews/teams/repository/TeamRepository;)V", "teams", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/experlabs/footballnews/portal/models/Team;", "Lkotlin/collections/ArrayList;", "getTeams", "()Landroidx/lifecycle/LiveData;", "getTeamsFromRepository", "", "callback", "Lkotlin/Function2;", "", "", "response", "flag", "message", "app_debug"})
public final class TeamViewModel extends androidx.lifecycle.ViewModel {
    private final com.experlabs.footballnews.teams.repository.TeamRepository repository = null;
    
    public TeamViewModel(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.teams.repository.TeamRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.experlabs.footballnews.portal.models.Team>> getTeams() {
        return null;
    }
    
    public final void getTeamsFromRepository(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    private final void response(boolean flag, java.lang.String message, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
}
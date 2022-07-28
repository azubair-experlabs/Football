// Generated by data binding compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.portal.models.Team;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TeamItemBinding extends ViewDataBinding {
  @Bindable
  protected String mIndex;

  @Bindable
  protected Team mTeamItem;

  protected TeamItemBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setIndex(@Nullable String index);

  @Nullable
  public String getIndex() {
    return mIndex;
  }

  public abstract void setTeamItem(@Nullable Team teamItem);

  @Nullable
  public Team getTeamItem() {
    return mTeamItem;
  }

  @NonNull
  public static TeamItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.team_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TeamItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TeamItemBinding>inflateInternal(inflater, R.layout.team_item, root, attachToRoot, component);
  }

  @NonNull
  public static TeamItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.team_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TeamItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TeamItemBinding>inflateInternal(inflater, R.layout.team_item, null, false, component);
  }

  public static TeamItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TeamItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (TeamItemBinding)bind(component, view, R.layout.team_item);
  }
}
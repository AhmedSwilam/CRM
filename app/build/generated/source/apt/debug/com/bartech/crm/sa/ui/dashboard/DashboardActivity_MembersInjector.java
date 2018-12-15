package com.bartech.crm.sa.ui.dashboard;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DashboardActivity_MembersInjector implements MembersInjector<DashboardActivity> {
  private final Provider<DashboardMvpPresenter<DashboardMvpView>> mPresenterProvider;

  public DashboardActivity_MembersInjector(
      Provider<DashboardMvpPresenter<DashboardMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<DashboardActivity> create(
      Provider<DashboardMvpPresenter<DashboardMvpView>> mPresenterProvider) {
    return new DashboardActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(DashboardActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      DashboardActivity instance,
      Provider<DashboardMvpPresenter<DashboardMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

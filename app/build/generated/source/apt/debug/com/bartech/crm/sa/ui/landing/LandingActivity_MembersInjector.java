package com.bartech.crm.sa.ui.landing;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LandingActivity_MembersInjector implements MembersInjector<LandingActivity> {
  private final Provider<LandingMvpPresenter<LandingMvpView>> mPresenterProvider;

  public LandingActivity_MembersInjector(
      Provider<LandingMvpPresenter<LandingMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<LandingActivity> create(
      Provider<LandingMvpPresenter<LandingMvpView>> mPresenterProvider) {
    return new LandingActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(LandingActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      LandingActivity instance, Provider<LandingMvpPresenter<LandingMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

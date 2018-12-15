package com.bartech.crm.sa.ui.mainscreen;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainScreenActivity_MembersInjector
    implements MembersInjector<MainScreenActivity> {
  private final Provider<MainScreenMvpPresenter<MainScreenMvpView>> mPresenterProvider;

  public MainScreenActivity_MembersInjector(
      Provider<MainScreenMvpPresenter<MainScreenMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MainScreenActivity> create(
      Provider<MainScreenMvpPresenter<MainScreenMvpView>> mPresenterProvider) {
    return new MainScreenActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MainScreenActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      MainScreenActivity instance,
      Provider<MainScreenMvpPresenter<MainScreenMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

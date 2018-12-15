package com.bartech.crm.sa.ui.register;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider;

  public RegisterActivity_MembersInjector(
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    return new RegisterActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RegisterActivity instance,
      Provider<RegisterMvpPresenter<RegisterMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

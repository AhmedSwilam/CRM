package com.bartech.crm.sa.ui.editprofile;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EditProfileActivity_MembersInjector
    implements MembersInjector<EditProfileActivity> {
  private final Provider<EditProfileMvpPresenter<EditProfileMvpView>> mPresenterProvider;

  public EditProfileActivity_MembersInjector(
      Provider<EditProfileMvpPresenter<EditProfileMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<EditProfileActivity> create(
      Provider<EditProfileMvpPresenter<EditProfileMvpView>> mPresenterProvider) {
    return new EditProfileActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(EditProfileActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      EditProfileActivity instance,
      Provider<EditProfileMvpPresenter<EditProfileMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

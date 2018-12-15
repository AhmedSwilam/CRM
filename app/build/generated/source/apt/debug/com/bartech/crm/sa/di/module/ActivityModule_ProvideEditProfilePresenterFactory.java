package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.editprofile.EditProfileMvpPresenter;
import com.bartech.crm.sa.ui.editprofile.EditProfileMvpView;
import com.bartech.crm.sa.ui.editprofile.EditProfilePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideEditProfilePresenterFactory
    implements Factory<EditProfileMvpPresenter<EditProfileMvpView>> {
  private final ActivityModule module;

  private final Provider<EditProfilePresenter<EditProfileMvpView>> presenterProvider;

  public ActivityModule_ProvideEditProfilePresenterFactory(
      ActivityModule module, Provider<EditProfilePresenter<EditProfileMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public EditProfileMvpPresenter<EditProfileMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideEditProfilePresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EditProfileMvpPresenter<EditProfileMvpView>> create(
      ActivityModule module, Provider<EditProfilePresenter<EditProfileMvpView>> presenterProvider) {
    return new ActivityModule_ProvideEditProfilePresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideEditProfilePresenter(EditProfilePresenter)}. */
  public static EditProfileMvpPresenter<EditProfileMvpView> proxyProvideEditProfilePresenter(
      ActivityModule instance, EditProfilePresenter<EditProfileMvpView> presenter) {
    return instance.provideEditProfilePresenter(presenter);
  }
}

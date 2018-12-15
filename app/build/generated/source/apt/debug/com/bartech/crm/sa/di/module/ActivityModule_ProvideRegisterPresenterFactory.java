package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.register.RegisterMvpPresenter;
import com.bartech.crm.sa.ui.register.RegisterMvpView;
import com.bartech.crm.sa.ui.register.RegisterPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRegisterPresenterFactory
    implements Factory<RegisterMvpPresenter<RegisterMvpView>> {
  private final ActivityModule module;

  private final Provider<RegisterPresenter<RegisterMvpView>> presenterProvider;

  public ActivityModule_ProvideRegisterPresenterFactory(
      ActivityModule module, Provider<RegisterPresenter<RegisterMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RegisterMvpPresenter<RegisterMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideRegisterPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RegisterMvpPresenter<RegisterMvpView>> create(
      ActivityModule module, Provider<RegisterPresenter<RegisterMvpView>> presenterProvider) {
    return new ActivityModule_ProvideRegisterPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideRegisterPresenter(RegisterPresenter)}. */
  public static RegisterMvpPresenter<RegisterMvpView> proxyProvideRegisterPresenter(
      ActivityModule instance, RegisterPresenter<RegisterMvpView> presenter) {
    return instance.provideRegisterPresenter(presenter);
  }
}

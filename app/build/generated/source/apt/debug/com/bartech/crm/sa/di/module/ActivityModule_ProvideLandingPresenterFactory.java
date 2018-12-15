package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.landing.LandingMvpPresenter;
import com.bartech.crm.sa.ui.landing.LandingMvpView;
import com.bartech.crm.sa.ui.landing.LandingPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideLandingPresenterFactory
    implements Factory<LandingMvpPresenter<LandingMvpView>> {
  private final ActivityModule module;

  private final Provider<LandingPresenter<LandingMvpView>> presenterProvider;

  public ActivityModule_ProvideLandingPresenterFactory(
      ActivityModule module, Provider<LandingPresenter<LandingMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public LandingMvpPresenter<LandingMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideLandingPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LandingMvpPresenter<LandingMvpView>> create(
      ActivityModule module, Provider<LandingPresenter<LandingMvpView>> presenterProvider) {
    return new ActivityModule_ProvideLandingPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideLandingPresenter(LandingPresenter)}. */
  public static LandingMvpPresenter<LandingMvpView> proxyProvideLandingPresenter(
      ActivityModule instance, LandingPresenter<LandingMvpView> presenter) {
    return instance.provideLandingPresenter(presenter);
  }
}

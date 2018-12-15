package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.dashboard.DashboardMvpPresenter;
import com.bartech.crm.sa.ui.dashboard.DashboardMvpView;
import com.bartech.crm.sa.ui.dashboard.DashboardPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideDashboardPresenterFactory
    implements Factory<DashboardMvpPresenter<DashboardMvpView>> {
  private final ActivityModule module;

  private final Provider<DashboardPresenter<DashboardMvpView>> presenterProvider;

  public ActivityModule_ProvideDashboardPresenterFactory(
      ActivityModule module, Provider<DashboardPresenter<DashboardMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public DashboardMvpPresenter<DashboardMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideDashboardPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DashboardMvpPresenter<DashboardMvpView>> create(
      ActivityModule module, Provider<DashboardPresenter<DashboardMvpView>> presenterProvider) {
    return new ActivityModule_ProvideDashboardPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideDashboardPresenter(DashboardPresenter)}. */
  public static DashboardMvpPresenter<DashboardMvpView> proxyProvideDashboardPresenter(
      ActivityModule instance, DashboardPresenter<DashboardMvpView> presenter) {
    return instance.provideDashboardPresenter(presenter);
  }
}

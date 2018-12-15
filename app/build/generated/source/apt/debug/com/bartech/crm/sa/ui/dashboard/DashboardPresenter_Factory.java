package com.bartech.crm.sa.ui.dashboard;

import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DashboardPresenter_Factory<V extends DashboardMvpView>
    implements Factory<DashboardPresenter<V>> {
  private final MembersInjector<DashboardPresenter<V>> dashboardPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public DashboardPresenter_Factory(
      MembersInjector<DashboardPresenter<V>> dashboardPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert dashboardPresenterMembersInjector != null;
    this.dashboardPresenterMembersInjector = dashboardPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public DashboardPresenter<V> get() {
    return MembersInjectors.injectMembers(
        dashboardPresenterMembersInjector,
        new DashboardPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends DashboardMvpView> Factory<DashboardPresenter<V>> create(
      MembersInjector<DashboardPresenter<V>> dashboardPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new DashboardPresenter_Factory<V>(
        dashboardPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

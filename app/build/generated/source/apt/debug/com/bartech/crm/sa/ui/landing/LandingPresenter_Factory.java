package com.bartech.crm.sa.ui.landing;

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
public final class LandingPresenter_Factory<V extends LandingMvpView>
    implements Factory<LandingPresenter<V>> {
  private final MembersInjector<LandingPresenter<V>> landingPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public LandingPresenter_Factory(
      MembersInjector<LandingPresenter<V>> landingPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert landingPresenterMembersInjector != null;
    this.landingPresenterMembersInjector = landingPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public LandingPresenter<V> get() {
    return MembersInjectors.injectMembers(
        landingPresenterMembersInjector,
        new LandingPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends LandingMvpView> Factory<LandingPresenter<V>> create(
      MembersInjector<LandingPresenter<V>> landingPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new LandingPresenter_Factory<V>(
        landingPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

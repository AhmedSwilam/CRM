package com.bartech.crm.sa.ui.mainscreen;

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
public final class MainScreenPresenter_Factory<V extends MainScreenMvpView>
    implements Factory<MainScreenPresenter<V>> {
  private final MembersInjector<MainScreenPresenter<V>> mainScreenPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MainScreenPresenter_Factory(
      MembersInjector<MainScreenPresenter<V>> mainScreenPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert mainScreenPresenterMembersInjector != null;
    this.mainScreenPresenterMembersInjector = mainScreenPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MainScreenPresenter<V> get() {
    return MembersInjectors.injectMembers(
        mainScreenPresenterMembersInjector,
        new MainScreenPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MainScreenMvpView> Factory<MainScreenPresenter<V>> create(
      MembersInjector<MainScreenPresenter<V>> mainScreenPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MainScreenPresenter_Factory<V>(
        mainScreenPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

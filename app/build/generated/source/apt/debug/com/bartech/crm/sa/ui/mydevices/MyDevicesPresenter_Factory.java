package com.bartech.crm.sa.ui.mydevices;

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
public final class MyDevicesPresenter_Factory<V extends MyDevicesMvpView>
    implements Factory<MyDevicesPresenter<V>> {
  private final MembersInjector<MyDevicesPresenter<V>> myDevicesPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MyDevicesPresenter_Factory(
      MembersInjector<MyDevicesPresenter<V>> myDevicesPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert myDevicesPresenterMembersInjector != null;
    this.myDevicesPresenterMembersInjector = myDevicesPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MyDevicesPresenter<V> get() {
    return MembersInjectors.injectMembers(
        myDevicesPresenterMembersInjector,
        new MyDevicesPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MyDevicesMvpView> Factory<MyDevicesPresenter<V>> create(
      MembersInjector<MyDevicesPresenter<V>> myDevicesPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MyDevicesPresenter_Factory<V>(
        myDevicesPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

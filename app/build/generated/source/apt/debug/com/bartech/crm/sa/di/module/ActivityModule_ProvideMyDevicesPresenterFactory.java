package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpPresenter;
import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpView;
import com.bartech.crm.sa.ui.mydevices.MyDevicesPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMyDevicesPresenterFactory
    implements Factory<MyDevicesMvpPresenter<MyDevicesMvpView>> {
  private final ActivityModule module;

  private final Provider<MyDevicesPresenter<MyDevicesMvpView>> presenterProvider;

  public ActivityModule_ProvideMyDevicesPresenterFactory(
      ActivityModule module, Provider<MyDevicesPresenter<MyDevicesMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MyDevicesMvpPresenter<MyDevicesMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMyDevicesPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyDevicesMvpPresenter<MyDevicesMvpView>> create(
      ActivityModule module, Provider<MyDevicesPresenter<MyDevicesMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMyDevicesPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMyDevicesPresenter(MyDevicesPresenter)}. */
  public static MyDevicesMvpPresenter<MyDevicesMvpView> proxyProvideMyDevicesPresenter(
      ActivityModule instance, MyDevicesPresenter<MyDevicesMvpView> presenter) {
    return instance.provideMyDevicesPresenter(presenter);
  }
}

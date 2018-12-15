package com.bartech.crm.sa.ui.mydevices;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyDevicesActivity_MembersInjector implements MembersInjector<MyDevicesActivity> {
  private final Provider<MyDevicesMvpPresenter<MyDevicesMvpView>> mPresenterProvider;

  public MyDevicesActivity_MembersInjector(
      Provider<MyDevicesMvpPresenter<MyDevicesMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MyDevicesActivity> create(
      Provider<MyDevicesMvpPresenter<MyDevicesMvpView>> mPresenterProvider) {
    return new MyDevicesActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MyDevicesActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      MyDevicesActivity instance,
      Provider<MyDevicesMvpPresenter<MyDevicesMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

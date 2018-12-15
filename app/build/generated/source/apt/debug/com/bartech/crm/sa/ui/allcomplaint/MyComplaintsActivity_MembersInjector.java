package com.bartech.crm.sa.ui.allcomplaint;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyComplaintsActivity_MembersInjector
    implements MembersInjector<MyComplaintsActivity> {
  private final Provider<MyComplaintsMvpPresenter<MyComplaintsMvpView>> mPresenterProvider;

  public MyComplaintsActivity_MembersInjector(
      Provider<MyComplaintsMvpPresenter<MyComplaintsMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MyComplaintsActivity> create(
      Provider<MyComplaintsMvpPresenter<MyComplaintsMvpView>> mPresenterProvider) {
    return new MyComplaintsActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MyComplaintsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      MyComplaintsActivity instance,
      Provider<MyComplaintsMvpPresenter<MyComplaintsMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

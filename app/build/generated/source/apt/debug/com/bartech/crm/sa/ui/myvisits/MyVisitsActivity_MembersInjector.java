package com.bartech.crm.sa.ui.myvisits;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyVisitsActivity_MembersInjector implements MembersInjector<MyVisitsActivity> {
  private final Provider<MyVisitsMvpPresenter<MyVisitsMvpView>> mPresenterProvider;

  public MyVisitsActivity_MembersInjector(
      Provider<MyVisitsMvpPresenter<MyVisitsMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<MyVisitsActivity> create(
      Provider<MyVisitsMvpPresenter<MyVisitsMvpView>> mPresenterProvider) {
    return new MyVisitsActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(MyVisitsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      MyVisitsActivity instance,
      Provider<MyVisitsMvpPresenter<MyVisitsMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

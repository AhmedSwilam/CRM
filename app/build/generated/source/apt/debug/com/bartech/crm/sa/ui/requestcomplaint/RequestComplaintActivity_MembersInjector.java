package com.bartech.crm.sa.ui.requestcomplaint;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RequestComplaintActivity_MembersInjector
    implements MembersInjector<RequestComplaintActivity> {
  private final Provider<RequestComplaintMvpPresenter<RequestComplaintMvpView>> mPresenterProvider;

  public RequestComplaintActivity_MembersInjector(
      Provider<RequestComplaintMvpPresenter<RequestComplaintMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RequestComplaintActivity> create(
      Provider<RequestComplaintMvpPresenter<RequestComplaintMvpView>> mPresenterProvider) {
    return new RequestComplaintActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RequestComplaintActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RequestComplaintActivity instance,
      Provider<RequestComplaintMvpPresenter<RequestComplaintMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}

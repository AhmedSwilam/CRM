package com.bartech.crm.sa.ui.requestcomplaint;

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
public final class RequestComplaintPresenter_Factory<V extends RequestComplaintMvpView>
    implements Factory<RequestComplaintPresenter<V>> {
  private final MembersInjector<RequestComplaintPresenter<V>>
      requestComplaintPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public RequestComplaintPresenter_Factory(
      MembersInjector<RequestComplaintPresenter<V>> requestComplaintPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert requestComplaintPresenterMembersInjector != null;
    this.requestComplaintPresenterMembersInjector = requestComplaintPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public RequestComplaintPresenter<V> get() {
    return MembersInjectors.injectMembers(
        requestComplaintPresenterMembersInjector,
        new RequestComplaintPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends RequestComplaintMvpView> Factory<RequestComplaintPresenter<V>> create(
      MembersInjector<RequestComplaintPresenter<V>> requestComplaintPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new RequestComplaintPresenter_Factory<V>(
        requestComplaintPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

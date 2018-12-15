package com.bartech.crm.sa.ui.myvisits;

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
public final class MyVisitsPresenter_Factory<V extends MyVisitsMvpView>
    implements Factory<MyVisitsPresenter<V>> {
  private final MembersInjector<MyVisitsPresenter<V>> myVisitsPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MyVisitsPresenter_Factory(
      MembersInjector<MyVisitsPresenter<V>> myVisitsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert myVisitsPresenterMembersInjector != null;
    this.myVisitsPresenterMembersInjector = myVisitsPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MyVisitsPresenter<V> get() {
    return MembersInjectors.injectMembers(
        myVisitsPresenterMembersInjector,
        new MyVisitsPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MyVisitsMvpView> Factory<MyVisitsPresenter<V>> create(
      MembersInjector<MyVisitsPresenter<V>> myVisitsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MyVisitsPresenter_Factory<V>(
        myVisitsPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

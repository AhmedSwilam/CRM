package com.bartech.crm.sa.ui.allcomplaint;

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
public final class MyComplaintsPresenter_Factory<V extends MyComplaintsMvpView>
    implements Factory<MyComplaintsPresenter<V>> {
  private final MembersInjector<MyComplaintsPresenter<V>> myComplaintsPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MyComplaintsPresenter_Factory(
      MembersInjector<MyComplaintsPresenter<V>> myComplaintsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert myComplaintsPresenterMembersInjector != null;
    this.myComplaintsPresenterMembersInjector = myComplaintsPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MyComplaintsPresenter<V> get() {
    return MembersInjectors.injectMembers(
        myComplaintsPresenterMembersInjector,
        new MyComplaintsPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MyComplaintsMvpView> Factory<MyComplaintsPresenter<V>> create(
      MembersInjector<MyComplaintsPresenter<V>> myComplaintsPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MyComplaintsPresenter_Factory<V>(
        myComplaintsPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

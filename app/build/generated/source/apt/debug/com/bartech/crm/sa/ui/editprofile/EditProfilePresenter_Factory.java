package com.bartech.crm.sa.ui.editprofile;

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
public final class EditProfilePresenter_Factory<V extends EditProfileMvpView>
    implements Factory<EditProfilePresenter<V>> {
  private final MembersInjector<EditProfilePresenter<V>> editProfilePresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public EditProfilePresenter_Factory(
      MembersInjector<EditProfilePresenter<V>> editProfilePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert editProfilePresenterMembersInjector != null;
    this.editProfilePresenterMembersInjector = editProfilePresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public EditProfilePresenter<V> get() {
    return MembersInjectors.injectMembers(
        editProfilePresenterMembersInjector,
        new EditProfilePresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends EditProfileMvpView> Factory<EditProfilePresenter<V>> create(
      MembersInjector<EditProfilePresenter<V>> editProfilePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new EditProfilePresenter_Factory<V>(
        editProfilePresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}

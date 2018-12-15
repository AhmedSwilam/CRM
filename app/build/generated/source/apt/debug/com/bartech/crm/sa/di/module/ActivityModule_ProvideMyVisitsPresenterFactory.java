package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpPresenter;
import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpView;
import com.bartech.crm.sa.ui.myvisits.MyVisitsPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMyVisitsPresenterFactory
    implements Factory<MyVisitsMvpPresenter<MyVisitsMvpView>> {
  private final ActivityModule module;

  private final Provider<MyVisitsPresenter<MyVisitsMvpView>> presenterProvider;

  public ActivityModule_ProvideMyVisitsPresenterFactory(
      ActivityModule module, Provider<MyVisitsPresenter<MyVisitsMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MyVisitsMvpPresenter<MyVisitsMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMyVisitsPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyVisitsMvpPresenter<MyVisitsMvpView>> create(
      ActivityModule module, Provider<MyVisitsPresenter<MyVisitsMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMyVisitsPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMyVisitsPresenter(MyVisitsPresenter)}. */
  public static MyVisitsMvpPresenter<MyVisitsMvpView> proxyProvideMyVisitsPresenter(
      ActivityModule instance, MyVisitsPresenter<MyVisitsMvpView> presenter) {
    return instance.provideMyVisitsPresenter(presenter);
  }
}

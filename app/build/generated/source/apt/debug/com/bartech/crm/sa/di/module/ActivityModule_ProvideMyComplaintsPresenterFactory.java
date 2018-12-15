package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpPresenter;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpView;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMyComplaintsPresenterFactory
    implements Factory<MyComplaintsMvpPresenter<MyComplaintsMvpView>> {
  private final ActivityModule module;

  private final Provider<MyComplaintsPresenter<MyComplaintsMvpView>> presenterProvider;

  public ActivityModule_ProvideMyComplaintsPresenterFactory(
      ActivityModule module,
      Provider<MyComplaintsPresenter<MyComplaintsMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MyComplaintsMvpPresenter<MyComplaintsMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMyComplaintsPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyComplaintsMvpPresenter<MyComplaintsMvpView>> create(
      ActivityModule module,
      Provider<MyComplaintsPresenter<MyComplaintsMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMyComplaintsPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMyComplaintsPresenter(MyComplaintsPresenter)}. */
  public static MyComplaintsMvpPresenter<MyComplaintsMvpView> proxyProvideMyComplaintsPresenter(
      ActivityModule instance, MyComplaintsPresenter<MyComplaintsMvpView> presenter) {
    return instance.provideMyComplaintsPresenter(presenter);
  }
}

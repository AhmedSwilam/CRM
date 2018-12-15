package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpPresenter;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpView;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMyComplaintPresenterFactory
    implements Factory<RequestComplaintMvpPresenter<RequestComplaintMvpView>> {
  private final ActivityModule module;

  private final Provider<RequestComplaintPresenter<RequestComplaintMvpView>> presenterProvider;

  public ActivityModule_ProvideMyComplaintPresenterFactory(
      ActivityModule module,
      Provider<RequestComplaintPresenter<RequestComplaintMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RequestComplaintMvpPresenter<RequestComplaintMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMyComplaintPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RequestComplaintMvpPresenter<RequestComplaintMvpView>> create(
      ActivityModule module,
      Provider<RequestComplaintPresenter<RequestComplaintMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMyComplaintPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMyComplaintPresenter(RequestComplaintPresenter)}. */
  public static RequestComplaintMvpPresenter<RequestComplaintMvpView>
      proxyProvideMyComplaintPresenter(
          ActivityModule instance, RequestComplaintPresenter<RequestComplaintMvpView> presenter) {
    return instance.provideMyComplaintPresenter(presenter);
  }
}

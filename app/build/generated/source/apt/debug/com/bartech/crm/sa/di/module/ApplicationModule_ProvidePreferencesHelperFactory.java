package com.bartech.crm.sa.di.module;

import com.bartech.crm.sa.data.prefs.AppPreferencesHelper;
import com.bartech.crm.sa.data.prefs.PreferencesHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidePreferencesHelperFactory
    implements Factory<PreferencesHelper> {
  private final ApplicationModule module;

  private final Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  public ApplicationModule_ProvidePreferencesHelperFactory(
      ApplicationModule module, Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    assert module != null;
    this.module = module;
    assert appPreferencesHelperProvider != null;
    this.appPreferencesHelperProvider = appPreferencesHelperProvider;
  }

  @Override
  public PreferencesHelper get() {
    return Preconditions.checkNotNull(
        module.providePreferencesHelper(appPreferencesHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PreferencesHelper> create(
      ApplicationModule module, Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    return new ApplicationModule_ProvidePreferencesHelperFactory(
        module, appPreferencesHelperProvider);
  }

  /** Proxies {@link ApplicationModule#providePreferencesHelper(AppPreferencesHelper)}. */
  public static PreferencesHelper proxyProvidePreferencesHelper(
      ApplicationModule instance, AppPreferencesHelper appPreferencesHelper) {
    return instance.providePreferencesHelper(appPreferencesHelper);
  }
}

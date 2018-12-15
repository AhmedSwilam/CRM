package com.bartech.crm.sa.di.component;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.di.module.ActivityModule;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideAboutPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideActivityFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideBlogAdapterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideDashboardPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideEditProfilePresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideFeedPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideLandingPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideLoginPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMainPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMainScreenPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMyComplaintPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMyComplaintsPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMyDevicesPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideMyVisitsPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideRegisterPresenterFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import com.bartech.crm.sa.di.module.ActivityModule_ProvideSplashPresenterFactory;
import com.bartech.crm.sa.ui.about.AboutFragment;
import com.bartech.crm.sa.ui.about.AboutFragment_MembersInjector;
import com.bartech.crm.sa.ui.about.AboutMvpPresenter;
import com.bartech.crm.sa.ui.about.AboutMvpView;
import com.bartech.crm.sa.ui.about.AboutPresenter;
import com.bartech.crm.sa.ui.about.AboutPresenter_Factory;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsActivity;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsActivity_MembersInjector;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpPresenter;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpView;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsPresenter;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsPresenter_Factory;
import com.bartech.crm.sa.ui.dashboard.DashboardActivity;
import com.bartech.crm.sa.ui.dashboard.DashboardActivity_MembersInjector;
import com.bartech.crm.sa.ui.dashboard.DashboardMvpPresenter;
import com.bartech.crm.sa.ui.dashboard.DashboardMvpView;
import com.bartech.crm.sa.ui.dashboard.DashboardPresenter;
import com.bartech.crm.sa.ui.dashboard.DashboardPresenter_Factory;
import com.bartech.crm.sa.ui.editprofile.EditProfileActivity;
import com.bartech.crm.sa.ui.editprofile.EditProfileActivity_MembersInjector;
import com.bartech.crm.sa.ui.editprofile.EditProfileMvpPresenter;
import com.bartech.crm.sa.ui.editprofile.EditProfileMvpView;
import com.bartech.crm.sa.ui.editprofile.EditProfilePresenter;
import com.bartech.crm.sa.ui.editprofile.EditProfilePresenter_Factory;
import com.bartech.crm.sa.ui.feed.FeedActivity;
import com.bartech.crm.sa.ui.feed.FeedActivity_MembersInjector;
import com.bartech.crm.sa.ui.feed.FeedMvpPresenter;
import com.bartech.crm.sa.ui.feed.FeedMvpView;
import com.bartech.crm.sa.ui.feed.FeedPagerAdapter;
import com.bartech.crm.sa.ui.feed.FeedPresenter;
import com.bartech.crm.sa.ui.feed.FeedPresenter_Factory;
import com.bartech.crm.sa.ui.feed.blogs.BlogAdapter;
import com.bartech.crm.sa.ui.feed.blogs.BlogFragment;
import com.bartech.crm.sa.ui.feed.blogs.BlogFragment_MembersInjector;
import com.bartech.crm.sa.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.crm.sa.ui.feed.blogs.BlogMvpView;
import com.bartech.crm.sa.ui.feed.blogs.BlogPresenter;
import com.bartech.crm.sa.ui.feed.blogs.BlogPresenter_Factory;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceFragment;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourcePresenter_Factory;
import com.bartech.crm.sa.ui.landing.LandingActivity;
import com.bartech.crm.sa.ui.landing.LandingActivity_MembersInjector;
import com.bartech.crm.sa.ui.landing.LandingMvpPresenter;
import com.bartech.crm.sa.ui.landing.LandingMvpView;
import com.bartech.crm.sa.ui.landing.LandingPresenter;
import com.bartech.crm.sa.ui.landing.LandingPresenter_Factory;
import com.bartech.crm.sa.ui.login.LoginActivity;
import com.bartech.crm.sa.ui.login.LoginActivity_MembersInjector;
import com.bartech.crm.sa.ui.login.LoginMvpPresenter;
import com.bartech.crm.sa.ui.login.LoginMvpView;
import com.bartech.crm.sa.ui.login.LoginPresenter;
import com.bartech.crm.sa.ui.login.LoginPresenter_Factory;
import com.bartech.crm.sa.ui.main.MainActivity;
import com.bartech.crm.sa.ui.main.MainActivity_MembersInjector;
import com.bartech.crm.sa.ui.main.MainMvpPresenter;
import com.bartech.crm.sa.ui.main.MainMvpView;
import com.bartech.crm.sa.ui.main.MainPresenter;
import com.bartech.crm.sa.ui.main.MainPresenter_Factory;
import com.bartech.crm.sa.ui.main.rating.RateUsDialog;
import com.bartech.crm.sa.ui.main.rating.RateUsDialog_MembersInjector;
import com.bartech.crm.sa.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.crm.sa.ui.main.rating.RatingDialogMvpView;
import com.bartech.crm.sa.ui.main.rating.RatingDialogPresenter;
import com.bartech.crm.sa.ui.main.rating.RatingDialogPresenter_Factory;
import com.bartech.crm.sa.ui.mainscreen.MainScreenActivity;
import com.bartech.crm.sa.ui.mainscreen.MainScreenActivity_MembersInjector;
import com.bartech.crm.sa.ui.mainscreen.MainScreenMvpPresenter;
import com.bartech.crm.sa.ui.mainscreen.MainScreenMvpView;
import com.bartech.crm.sa.ui.mainscreen.MainScreenPresenter;
import com.bartech.crm.sa.ui.mainscreen.MainScreenPresenter_Factory;
import com.bartech.crm.sa.ui.mydevices.MyDevicesActivity;
import com.bartech.crm.sa.ui.mydevices.MyDevicesActivity_MembersInjector;
import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpPresenter;
import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpView;
import com.bartech.crm.sa.ui.mydevices.MyDevicesPresenter;
import com.bartech.crm.sa.ui.mydevices.MyDevicesPresenter_Factory;
import com.bartech.crm.sa.ui.myvisits.MyVisitsActivity;
import com.bartech.crm.sa.ui.myvisits.MyVisitsActivity_MembersInjector;
import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpPresenter;
import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpView;
import com.bartech.crm.sa.ui.myvisits.MyVisitsPresenter;
import com.bartech.crm.sa.ui.myvisits.MyVisitsPresenter_Factory;
import com.bartech.crm.sa.ui.register.RegisterActivity;
import com.bartech.crm.sa.ui.register.RegisterActivity_MembersInjector;
import com.bartech.crm.sa.ui.register.RegisterMvpPresenter;
import com.bartech.crm.sa.ui.register.RegisterMvpView;
import com.bartech.crm.sa.ui.register.RegisterPresenter;
import com.bartech.crm.sa.ui.register.RegisterPresenter_Factory;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintActivity;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintActivity_MembersInjector;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpPresenter;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpView;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintPresenter;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintPresenter_Factory;
import com.bartech.crm.sa.ui.splash.SplashActivity;
import com.bartech.crm.sa.ui.splash.SplashActivity_MembersInjector;
import com.bartech.crm.sa.ui.splash.SplashMvpPresenter;
import com.bartech.crm.sa.ui.splash.SplashMvpView;
import com.bartech.crm.sa.ui.splash.SplashPresenter;
import com.bartech.crm.sa.ui.splash.SplashPresenter_Factory;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<LandingPresenter<LandingMvpView>> landingPresenterProvider;

  private Provider<LandingMvpPresenter<LandingMvpView>> provideLandingPresenterProvider;

  private MembersInjector<LandingActivity> landingActivityMembersInjector;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedPresenter<FeedMvpView>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<AboutPresenter<AboutMvpView>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView>> provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourcePresenter<OpenSourceMvpView>> openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogPresenter<BlogMvpView>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView>> provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogPresenter<RatingDialogMvpView>> ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView>> provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private Provider<LoginPresenter<LoginMvpView>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView>> provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<RegisterPresenter<RegisterMvpView>> registerPresenterProvider;

  private Provider<RegisterMvpPresenter<RegisterMvpView>> provideRegisterPresenterProvider;

  private MembersInjector<RegisterActivity> registerActivityMembersInjector;

  private Provider<MainScreenPresenter<MainScreenMvpView>> mainScreenPresenterProvider;

  private Provider<MainScreenMvpPresenter<MainScreenMvpView>> provideMainScreenPresenterProvider;

  private MembersInjector<MainScreenActivity> mainScreenActivityMembersInjector;

  private Provider<RequestComplaintPresenter<RequestComplaintMvpView>>
      requestComplaintPresenterProvider;

  private Provider<RequestComplaintMvpPresenter<RequestComplaintMvpView>>
      provideMyComplaintPresenterProvider;

  private MembersInjector<RequestComplaintActivity> requestComplaintActivityMembersInjector;

  private Provider<MyComplaintsPresenter<MyComplaintsMvpView>> myComplaintsPresenterProvider;

  private Provider<MyComplaintsMvpPresenter<MyComplaintsMvpView>>
      provideMyComplaintsPresenterProvider;

  private MembersInjector<MyComplaintsActivity> myComplaintsActivityMembersInjector;

  private Provider<MyDevicesPresenter<MyDevicesMvpView>> myDevicesPresenterProvider;

  private Provider<MyDevicesMvpPresenter<MyDevicesMvpView>> provideMyDevicesPresenterProvider;

  private MembersInjector<MyDevicesActivity> myDevicesActivityMembersInjector;

  private Provider<MyVisitsPresenter<MyVisitsMvpView>> myVisitsPresenterProvider;

  private Provider<MyVisitsMvpPresenter<MyVisitsMvpView>> provideMyVisitsPresenterProvider;

  private MembersInjector<MyVisitsActivity> myVisitsActivityMembersInjector;

  private Provider<DashboardPresenter<DashboardMvpView>> dashboardPresenterProvider;

  private Provider<DashboardMvpPresenter<DashboardMvpView>> provideDashboardPresenterProvider;

  private MembersInjector<DashboardActivity> dashboardActivityMembersInjector;

  private Provider<EditProfilePresenter<EditProfileMvpView>> editProfilePresenterProvider;

  private Provider<EditProfileMvpPresenter<EditProfileMvpView>> provideEditProfilePresenterProvider;

  private MembersInjector<EditProfileActivity> editProfileActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.landingPresenterProvider =
        LandingPresenter_Factory.create(
            MembersInjectors.<LandingPresenter<LandingMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLandingPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLandingPresenterFactory.create(
                builder.activityModule, landingPresenterProvider));

    this.landingActivityMembersInjector =
        LandingActivity_MembersInjector.create(provideLandingPresenterProvider);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors.<OpenSourcePresenter<OpenSourceMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors.<RatingDialogPresenter<RatingDialogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.registerPresenterProvider =
        RegisterPresenter_Factory.create(
            MembersInjectors.<RegisterPresenter<RegisterMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRegisterPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideRegisterPresenterFactory.create(
                builder.activityModule, registerPresenterProvider));

    this.registerActivityMembersInjector =
        RegisterActivity_MembersInjector.create(provideRegisterPresenterProvider);

    this.mainScreenPresenterProvider =
        MainScreenPresenter_Factory.create(
            MembersInjectors.<MainScreenPresenter<MainScreenMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainScreenPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainScreenPresenterFactory.create(
                builder.activityModule, mainScreenPresenterProvider));

    this.mainScreenActivityMembersInjector =
        MainScreenActivity_MembersInjector.create(provideMainScreenPresenterProvider);

    this.requestComplaintPresenterProvider =
        RequestComplaintPresenter_Factory.create(
            MembersInjectors.<RequestComplaintPresenter<RequestComplaintMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMyComplaintPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMyComplaintPresenterFactory.create(
                builder.activityModule, requestComplaintPresenterProvider));

    this.requestComplaintActivityMembersInjector =
        RequestComplaintActivity_MembersInjector.create(provideMyComplaintPresenterProvider);

    this.myComplaintsPresenterProvider =
        MyComplaintsPresenter_Factory.create(
            MembersInjectors.<MyComplaintsPresenter<MyComplaintsMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMyComplaintsPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMyComplaintsPresenterFactory.create(
                builder.activityModule, myComplaintsPresenterProvider));

    this.myComplaintsActivityMembersInjector =
        MyComplaintsActivity_MembersInjector.create(provideMyComplaintsPresenterProvider);

    this.myDevicesPresenterProvider =
        MyDevicesPresenter_Factory.create(
            MembersInjectors.<MyDevicesPresenter<MyDevicesMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMyDevicesPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMyDevicesPresenterFactory.create(
                builder.activityModule, myDevicesPresenterProvider));

    this.myDevicesActivityMembersInjector =
        MyDevicesActivity_MembersInjector.create(provideMyDevicesPresenterProvider);

    this.myVisitsPresenterProvider =
        MyVisitsPresenter_Factory.create(
            MembersInjectors.<MyVisitsPresenter<MyVisitsMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMyVisitsPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMyVisitsPresenterFactory.create(
                builder.activityModule, myVisitsPresenterProvider));

    this.myVisitsActivityMembersInjector =
        MyVisitsActivity_MembersInjector.create(provideMyVisitsPresenterProvider);

    this.dashboardPresenterProvider =
        DashboardPresenter_Factory.create(
            MembersInjectors.<DashboardPresenter<DashboardMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideDashboardPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideDashboardPresenterFactory.create(
                builder.activityModule, dashboardPresenterProvider));

    this.dashboardActivityMembersInjector =
        DashboardActivity_MembersInjector.create(provideDashboardPresenterProvider);

    this.editProfilePresenterProvider =
        EditProfilePresenter_Factory.create(
            MembersInjectors.<EditProfilePresenter<EditProfileMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideEditProfilePresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideEditProfilePresenterFactory.create(
                builder.activityModule, editProfilePresenterProvider));

    this.editProfileActivityMembersInjector =
        EditProfileActivity_MembersInjector.create(provideEditProfilePresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LandingActivity activity) {
    landingActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  @Override
  public void inject(LoginActivity loginActivity) {
    loginActivityMembersInjector.injectMembers(loginActivity);
  }

  @Override
  public void inject(RegisterActivity registerActivity) {
    registerActivityMembersInjector.injectMembers(registerActivity);
  }

  @Override
  public void inject(MainScreenActivity mainScreenActivity) {
    mainScreenActivityMembersInjector.injectMembers(mainScreenActivity);
  }

  @Override
  public void inject(RequestComplaintActivity requestComplaintActivity) {
    requestComplaintActivityMembersInjector.injectMembers(requestComplaintActivity);
  }

  @Override
  public void inject(MyComplaintsActivity myComplaintsActivity) {
    myComplaintsActivityMembersInjector.injectMembers(myComplaintsActivity);
  }

  @Override
  public void inject(MyDevicesActivity myDevicesActivity) {
    myDevicesActivityMembersInjector.injectMembers(myDevicesActivity);
  }

  @Override
  public void inject(MyVisitsActivity myVisitsActivity) {
    myVisitsActivityMembersInjector.injectMembers(myVisitsActivity);
  }

  @Override
  public void inject(DashboardActivity dashboardActivity) {
    dashboardActivityMembersInjector.injectMembers(dashboardActivity);
  }

  @Override
  public void inject(EditProfileActivity editProfileActivity) {
    editProfileActivityMembersInjector.injectMembers(editProfileActivity);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}

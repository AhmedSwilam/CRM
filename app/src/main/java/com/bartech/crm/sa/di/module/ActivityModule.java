/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.bartech.crm.sa.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.bartech.crm.sa.data.network.model.BlogResponse;
import com.bartech.crm.sa.data.network.model.OpenSourceResponse;
import com.bartech.crm.sa.di.ActivityContext;
import com.bartech.crm.sa.di.PerActivity;
import com.bartech.crm.sa.ui.about.AboutMvpPresenter;
import com.bartech.crm.sa.ui.about.AboutMvpView;
import com.bartech.crm.sa.ui.about.AboutPresenter;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpPresenter;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsMvpView;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsPresenter;
import com.bartech.crm.sa.ui.dashboard.DashboardMvpPresenter;
import com.bartech.crm.sa.ui.dashboard.DashboardMvpView;
import com.bartech.crm.sa.ui.dashboard.DashboardPresenter;
import com.bartech.crm.sa.ui.editprofile.EditProfileMvpPresenter;
import com.bartech.crm.sa.ui.editprofile.EditProfileMvpView;
import com.bartech.crm.sa.ui.editprofile.EditProfilePresenter;
import com.bartech.crm.sa.ui.feed.FeedMvpPresenter;
import com.bartech.crm.sa.ui.feed.FeedMvpView;
import com.bartech.crm.sa.ui.feed.FeedPagerAdapter;
import com.bartech.crm.sa.ui.feed.FeedPresenter;
import com.bartech.crm.sa.ui.feed.blogs.BlogAdapter;
import com.bartech.crm.sa.ui.feed.blogs.BlogMvpPresenter;
import com.bartech.crm.sa.ui.feed.blogs.BlogMvpView;
import com.bartech.crm.sa.ui.feed.blogs.BlogPresenter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceAdapter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceMvpPresenter;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceMvpView;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourcePresenter;
import com.bartech.crm.sa.ui.landing.LandingMvpPresenter;
import com.bartech.crm.sa.ui.landing.LandingMvpView;
import com.bartech.crm.sa.ui.landing.LandingPresenter;
import com.bartech.crm.sa.ui.login.LoginMvpPresenter;
import com.bartech.crm.sa.ui.login.LoginMvpView;
import com.bartech.crm.sa.ui.login.LoginPresenter;
import com.bartech.crm.sa.ui.main.MainMvpPresenter;
import com.bartech.crm.sa.ui.main.MainMvpView;
import com.bartech.crm.sa.ui.main.MainPresenter;
import com.bartech.crm.sa.ui.main.rating.RatingDialogMvpPresenter;
import com.bartech.crm.sa.ui.main.rating.RatingDialogMvpView;
import com.bartech.crm.sa.ui.main.rating.RatingDialogPresenter;
import com.bartech.crm.sa.ui.mainscreen.MainScreenMvpPresenter;
import com.bartech.crm.sa.ui.mainscreen.MainScreenMvpView;
import com.bartech.crm.sa.ui.mainscreen.MainScreenPresenter;
import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpPresenter;
import com.bartech.crm.sa.ui.mydevices.MyDevicesMvpView;
import com.bartech.crm.sa.ui.mydevices.MyDevicesPresenter;
import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpPresenter;
import com.bartech.crm.sa.ui.myvisits.MyVisitsMvpView;
import com.bartech.crm.sa.ui.myvisits.MyVisitsPresenter;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpPresenter;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintMvpView;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintPresenter;
import com.bartech.crm.sa.ui.register.RegisterMvpPresenter;
import com.bartech.crm.sa.ui.register.RegisterMvpView;
import com.bartech.crm.sa.ui.register.RegisterPresenter;
import com.bartech.crm.sa.ui.splash.SplashMvpPresenter;
import com.bartech.crm.sa.ui.splash.SplashMvpView;
import com.bartech.crm.sa.ui.splash.SplashPresenter;
import com.bartech.crm.sa.utils.rx.AppSchedulerProvider;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LandingMvpPresenter<LandingMvpView> provideLandingPresenter(
            LandingPresenter<LandingMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RegisterMvpPresenter<RegisterMvpView> provideRegisterPresenter(
            RegisterPresenter<RegisterMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    MyComplaintsMvpPresenter<MyComplaintsMvpView> provideMyComplaintsPresenter(
            MyComplaintsPresenter<MyComplaintsMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    DashboardMvpPresenter<DashboardMvpView> provideDashboardPresenter(
            DashboardPresenter<DashboardMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    MyDevicesMvpPresenter<MyDevicesMvpView> provideMyDevicesPresenter(
            MyDevicesPresenter<MyDevicesMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    MyVisitsMvpPresenter<MyVisitsMvpView> provideMyVisitsPresenter(
            MyVisitsPresenter<MyVisitsMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    EditProfileMvpPresenter<EditProfileMvpView> provideEditProfilePresenter(
            EditProfilePresenter<EditProfileMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    MainScreenMvpPresenter<MainScreenMvpView> provideMainScreenPresenter(
            MainScreenPresenter<MainScreenMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    RequestComplaintMvpPresenter<RequestComplaintMvpView> provideMyComplaintPresenter(
            RequestComplaintPresenter<RequestComplaintMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}

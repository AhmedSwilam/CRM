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

package com.bartech.crm.sa.di.component;

import com.bartech.crm.sa.di.PerActivity;
import com.bartech.crm.sa.di.module.ActivityModule;
import com.bartech.crm.sa.ui.about.AboutFragment;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsActivity;
import com.bartech.crm.sa.ui.dashboard.DashboardActivity;
import com.bartech.crm.sa.ui.editprofile.EditProfileActivity;
import com.bartech.crm.sa.ui.feed.FeedActivity;
import com.bartech.crm.sa.ui.feed.blogs.BlogFragment;
import com.bartech.crm.sa.ui.feed.opensource.OpenSourceFragment;
import com.bartech.crm.sa.ui.landing.LandingActivity;
import com.bartech.crm.sa.ui.login.LoginActivity;
import com.bartech.crm.sa.ui.main.MainActivity;
import com.bartech.crm.sa.ui.main.rating.RateUsDialog;
import com.bartech.crm.sa.ui.mainscreen.MainScreenActivity;
import com.bartech.crm.sa.ui.mydevices.MyDevicesActivity;
import com.bartech.crm.sa.ui.myvisits.MyVisitsActivity;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintActivity;
import com.bartech.crm.sa.ui.register.RegisterActivity;
import com.bartech.crm.sa.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LandingActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

    void inject(LoginActivity loginActivity);

    void inject(RegisterActivity registerActivity);

    void inject(MainScreenActivity mainScreenActivity);

    void inject(RequestComplaintActivity requestComplaintActivity);

    void inject(MyComplaintsActivity myComplaintsActivity);

    void inject(MyDevicesActivity myDevicesActivity);

    void inject(MyVisitsActivity myVisitsActivity);

    void inject(DashboardActivity dashboardActivity);

    void inject(EditProfileActivity editProfileActivity);
}

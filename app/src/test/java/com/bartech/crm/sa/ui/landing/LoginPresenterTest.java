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

package com.bartech.crm.sa.ui.landing;

import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.LoginRequest;
import com.bartech.crm.sa.data.network.model.LoginResponse;
import com.bartech.crm.sa.utils.rx.TestSchedulerProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.TestScheduler;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * Created by amitshekhar on 02/02/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LandingMvpView mMockLandingMvpView;
    @Mock
    DataManager mMockDataManager;

    private LandingPresenter<LandingMvpView> mLoginPresenter;
    private TestScheduler mTestScheduler;

    @BeforeClass
    public static void onlyOnce() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        mTestScheduler = new TestScheduler();
        TestSchedulerProvider testSchedulerProvider = new TestSchedulerProvider(mTestScheduler);
        mLoginPresenter = new LandingPresenter<>(
            mMockDataManager,
            testSchedulerProvider,
            compositeDisposable);
        mLoginPresenter.onAttach(mMockLandingMvpView);
    }

    @Test
    public void testServerLoginSuccess() {

        String email = "dummy@gmail.com";
        String password = "password";

        LoginResponse loginResponse = new LoginResponse();

        doReturn(Observable.just(loginResponse))
                .when(mMockDataManager)
                .doServerLoginApiCallCrm(new LoginRequest
                        .ServerLoginRequest(email, password));

        mLoginPresenter.onServerLoginClick(email, password);

        mTestScheduler.triggerActions();

        verify(mMockLandingMvpView).showLoading();
        verify(mMockLandingMvpView).hideLoading();
        verify(mMockLandingMvpView).openMainActivity();
    }


    @After
    public void tearDown() throws Exception {
        mLoginPresenter.onDetach();
    }

}
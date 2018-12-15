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

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.ui.login.LoginActivity;
import com.bartech.crm.sa.ui.main.MainActivity;
import com.bartech.crm.sa.ui.register.RegisterActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by janisharali on 27/01/17.
 */

public class LandingActivity extends BaseActivity implements LandingMvpView {

    @Inject
    LandingMvpPresenter<LandingMvpView> mPresenter;

    @BindView(R.id.btn_login)
    Button btnLogin;

    @BindView(R.id.btn_register)
    Button btnRegister;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LandingActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(LandingActivity.this);
    }

    @OnClick(R.id.btn_login)
    public void openloginActivity(){
        startActivity(new Intent(LandingActivity.this, LoginActivity.class));
    }
    @OnClick(R.id.btn_register)
    public void openRegisterActivity(){
        startActivity(new Intent(LandingActivity.this, RegisterActivity.class));
    }



    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}

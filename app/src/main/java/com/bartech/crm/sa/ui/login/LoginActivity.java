package com.bartech.crm.sa.ui.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.ui.mainscreen.MainScreenActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 5/23/2018.
 */

public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;
    @BindView(R.id.btn_login_screen)
    Button btnLogin;
    @BindView(R.id.et_Email)
    EditText etUserName;
    @BindView(R.id.et_password_login)
    EditText etPassword;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(LoginActivity.this);
    }

    @Override
    protected void setUp() {

    }

    @OnClick(R.id.btn_login_screen)
    void onServerLoginClicked(View view) {
        mPresenter.onServerLoginClicked(etUserName.getText().toString(), etPassword.getText().toString());
    }


    @Override
    public void openMainScreen() {
        startActivity(new Intent(LoginActivity.this, MainScreenActivity.class));
    }

    @Override
    public void saveLoginResponseCrm(LoginResponseCrm loginResponseCrm) {
        CommonUtils.saveUser(this,loginResponseCrm);

    }
}

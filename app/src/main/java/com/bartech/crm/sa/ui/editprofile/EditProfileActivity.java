package com.bartech.crm.sa.ui.editprofile;

import android.os.Bundle;
import android.widget.EditText;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.Data;
import com.bartech.crm.sa.data.network.model.EditProfileResponse;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 7/12/2018.
 */

public class EditProfileActivity extends BaseActivity implements EditProfileMvpView {
    @Inject
    EditProfileMvpPresenter<EditProfileMvpView> mPresenter;
    private List<Data> data;
    @BindView(R.id.edit_name_ar)
    EditText etNameAr;
    @BindView(R.id.edit_name_en)
    EditText etNameEn;
    @BindView(R.id.edit_address)
    EditText etAddress;
    @BindView(R.id.edit_phone)
    EditText etPhone;
    @BindView(R.id.edit_email)
    EditText etEmail;
    @BindView(R.id.edit_user_name)
    EditText etUserName;
    @BindView(R.id.edit_password)
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(EditProfileActivity.this);

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        etNameAr.setText(loginResponseCrm.getData().getNameAr());
        etNameEn.setText(loginResponseCrm.getData().getNameEn());
        if (loginResponseCrm.getData().getAddress()!=null){
            etAddress.setText(String.valueOf(loginResponseCrm.getData().getAddress()));
        }
        if (loginResponseCrm.getData().getPhone()!=null){
            etPhone.setText(String.valueOf(loginResponseCrm.getData().getPhone()));
        }
        if (loginResponseCrm.getData().getEmail()!=null){
            etEmail.setText(String.valueOf(loginResponseCrm.getData().getEmail()));
        }
        if (loginResponseCrm.getData().getUserName()!=null){
            etUserName.setText(String.valueOf(loginResponseCrm.getData().getUserName()));
        }
        if (loginResponseCrm.getData().getPassword()!=null){
            etPassword.setText(String.valueOf(loginResponseCrm.getData().getPassword().toString()));
        }

    }



    @Override
    protected void setUp() {

    }

    @Override
    public void setEditProfile(EditProfileResponse editProfile) {

    }
}

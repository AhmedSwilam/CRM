package com.bartech.crm.sa.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.DatumClient;
import com.bartech.crm.sa.data.network.model.RegistrationResponse;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.ui.login.LoginActivity;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 5/24/2018.
 */

public class RegisterActivity extends BaseActivity implements RegisterMvpView {

    @Inject
    RegisterMvpPresenter<RegisterMvpView> mPresenter;
    private ArrayAdapter<DatumClient> clientSpinnerAdapter;
    private String clientValue;
    private String clientText;
    @BindView(R.id.clientspinner)
    SearchableSpinner clientSpinner;
    @BindView(R.id.et_firstname)
    EditText etFirstName;
    @BindView(R.id.et_lastname)
    EditText etLastName;
    @BindView(R.id.et_user_name)
    EditText etUserName;
    @BindView(R.id.et_address)
    EditText etAddress;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_mobile1)
    EditText etMobile1;
    @BindView(R.id.et_mobile2)
    EditText etMobile2;
    @BindView(R.id.et_landline1)
    EditText etLandLine1;
    @BindView(R.id.et_landline2)
    EditText etLandLine2;
    @BindView(R.id.et_note)
    EditText etNote;
    @BindView(R.id.et_password_register)
    EditText etPassword;
    @BindView(R.id.et_company_name)
    EditText etCompanyName;
    @BindView(R.id.btn_registration)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(RegisterActivity.this);

        mPresenter.getClientType();
    }

    @OnClick(R.id.btn_registration)
    void onServerRegisterClicked(View view) {
        if (clientValue != null && clientValue.length() != 0) {
            mPresenter.onButtonRegisterClicked(Integer.valueOf(clientValue), etFirstName.getText().toString(), etLastName.getText().toString(),
                    etUserName.getText().toString(), etAddress.getText().toString(), etCompanyName.getText().toString(),
                    etEmail.getText().toString(), etMobile1.getText().toString(), etMobile2.getText().toString(),
                    etLandLine1.getText().toString(), etLandLine2.getText().toString(), etNote.getText().toString(),
                    etPassword.getText().toString());
        }
    }

    @Override
    protected void setUp() {

    }

    @Override
    public void setClientType(final List<DatumClient> datumClientClientList) {
        clientSpinnerAdapter = new ArrayAdapter<DatumClient>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        clientSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clientSpinner.setAdapter(clientSpinnerAdapter);
        clientSpinnerAdapter.addAll(datumClientClientList);
        clientSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                clientValue = datumClientClientList.get(position).getValue().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void openLandingActivity() {
        //startActivity(new Intent(RegisterActivity.this, LandingActivity.class));
    }

    @Override
    public void setNewUserRegisterd(RegistrationResponse registrationResponse) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        Toast.makeText(this, "تم التسجيل بنجاح يمكنك تسجيل الدخول الان", Toast.LENGTH_SHORT).show();
        finish();
    }
}

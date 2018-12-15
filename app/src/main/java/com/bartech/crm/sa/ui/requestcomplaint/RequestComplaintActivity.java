package com.bartech.crm.sa.ui.requestcomplaint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.ComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.DatumContract;
import com.bartech.crm.sa.data.network.model.DatumDevice;
import com.bartech.crm.sa.data.network.model.DatumFrequency;
import com.bartech.crm.sa.data.network.model.DatumProblem;
import com.bartech.crm.sa.data.network.model.DatumWarranty;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.ui.mainscreen.MainScreenActivity;
import com.bartech.crm.sa.utils.CommonUtils;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 6/4/2018.
 */

public class RequestComplaintActivity extends BaseActivity implements RequestComplaintMvpView {
    @Inject
    RequestComplaintMvpPresenter<RequestComplaintMvpView> mPresenter;
    private ArrayAdapter<DatumDevice> datumDeviceArrayAdapter;
    private ArrayAdapter<DatumFrequency> datumFrequencyArrayAdapter;
    private ArrayAdapter<DatumWarranty> datumWarrantyArrayAdapter;
    private ArrayAdapter<DatumContract> datumContractArrayAdapter;
    private ArrayAdapter<DatumProblem> datumProblemArrayAdapter;
    private String getProblemName;
    private String getContractName;
    private String getWarrantyName;
    private String getRepeatProblemName;
    private String getDeviceName;

    @BindView(R.id.spinner_choose_device)
    SearchableSpinner spinnerChooseDevice;
    @BindView(R.id.spinner_choose_repeat_problem)
    SearchableSpinner spinnerChooseRepeatProblem;
    @BindView(R.id.spinner_choose_warranty_type)
    SearchableSpinner spinnerChooseWarranty;
    @BindView(R.id.spinner_choose_contract_type)
    SearchableSpinner spinnerChooseContract;
    @BindView(R.id.spinner_choose_problem_type)
    SearchableSpinner spinnerChooseProblem;
    @BindView(R.id.txt_client_id)
    TextView txtClientId;
    @BindView(R.id.btn_create_request)
    Button btnCreateRequest;
    @BindView(R.id.et_device_name)
    EditText etDeviceName;
    @BindView(R.id.txt_device)
    TextView txtDeviceName;
    @BindView(R.id.comments)
    EditText etComments;
    @BindView(R.id.et_request_time)
    EditText etRequestTime;
    @BindView(R.id.et_first_time)
    EditText etFirstTime;
    @BindView(R.id.et_second_time)
    EditText etSecondTime;
    @BindView(R.id.et_third_time)
    EditText etThirdTime;
    @BindView(R.id.checkbox_warranty)
    CheckBox checkBoxWarranty;
    @BindView(R.id.et_warranty_start_date)
    EditText etWarrantyStartDate;
    @BindView(R.id.txt_warranty)
    TextView txtWarranty;
    @BindView(R.id.txt_contract_type)
    TextView txtContractType;
    @BindView(R.id.txt_warranty_start)
    TextView txtWarrantyStart;
    @BindView(R.id.note)
    TextView txtNotes;
    @BindView(R.id.checkbox_agreement)
    CheckBox checkBoxAgreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycomplaint);
        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String data = loginResponseCrm.getData().getId().toString();
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        txtClientId.setText(data);

        mPresenter.onAttach(RequestComplaintActivity.this);
        mPresenter.getProblemType();
        mPresenter.getDeviceName();
        mPresenter.getFrequencyType();
        mPresenter.getWarrantyType();
        mPresenter.getContractType();

        etDeviceName.setVisibility(View.GONE);
        txtDeviceName.setVisibility(View.GONE);
        etWarrantyStartDate.setVisibility(View.GONE);
        spinnerChooseWarranty.setVisibility(View.GONE);
        txtWarranty.setVisibility(View.GONE);
        txtWarrantyStart.setVisibility(View.GONE);
        txtContractType.setVisibility(View.GONE);
        spinnerChooseContract.setVisibility(View.GONE);
        checkBoxWarranty.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxWarranty.isChecked()){
                    etWarrantyStartDate.setVisibility(View.VISIBLE);
                    spinnerChooseWarranty.setVisibility(View.VISIBLE);
                    txtWarranty.setVisibility(View.VISIBLE);
                    txtWarrantyStart.setVisibility(View.VISIBLE);
                }else {
                    etWarrantyStartDate.setVisibility(View.GONE);
                    spinnerChooseWarranty.setVisibility(View.GONE);
                    txtWarranty.setVisibility(View.GONE);
                    txtWarrantyStart.setVisibility(View.GONE);
                }

            }
        });
        checkBoxAgreement.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxAgreement.isChecked()){
                    txtContractType.setVisibility(View.VISIBLE);
                    spinnerChooseContract.setVisibility(View.VISIBLE);
                }else {
                    txtContractType.setVisibility(View.GONE);
                    spinnerChooseContract.setVisibility(View.GONE);
                }
            }
        });

    }



    @Override
    protected void setUp() {

    }

    @OnClick(R.id.btn_create_request)
    void createNewRequest(View view) {
        if (getDeviceName!=null && getProblemName!=null && getRepeatProblemName!=null ){
            mPresenter.onCreateRequestButtonClicked(txtClientId.getText().toString(),getDeviceName,getProblemName,getRepeatProblemName,
                    etRequestTime.getText().toString(),etFirstTime.getText().toString(),etSecondTime.getText().toString(),
                    etThirdTime.getText().toString(),etWarrantyStartDate.getText().toString());
        }
        }



    @Override
    public void setDeviceName(final List<DatumDevice> deviceName) {
        datumDeviceArrayAdapter = new ArrayAdapter<DatumDevice>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        datumDeviceArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChooseDevice.setAdapter(datumDeviceArrayAdapter);
        datumDeviceArrayAdapter.addAll(deviceName);
        spinnerChooseDevice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getDeviceName = deviceName.get(position).getValue().toString();
                if (position != 0){
                    etDeviceName.setVisibility(View.VISIBLE);
                    txtDeviceName.setVisibility(View.VISIBLE);
                }

                }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void setFrequencyType(final List<DatumFrequency> frequencyType) {
        datumFrequencyArrayAdapter = new ArrayAdapter<DatumFrequency>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        datumFrequencyArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChooseRepeatProblem.setAdapter(datumFrequencyArrayAdapter);
        datumFrequencyArrayAdapter.addAll(frequencyType);
        spinnerChooseRepeatProblem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getRepeatProblemName = frequencyType.get(position).getValue().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void setWarrantyType(final List<DatumWarranty> warrantyType) {
        datumWarrantyArrayAdapter = new ArrayAdapter<DatumWarranty>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        datumWarrantyArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChooseWarranty.setAdapter(datumWarrantyArrayAdapter);
        datumWarrantyArrayAdapter.addAll(warrantyType);
        spinnerChooseWarranty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getWarrantyName = warrantyType.get(position).getValue().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void setContractType(final List<DatumContract> contractType) {
        datumContractArrayAdapter = new ArrayAdapter<DatumContract>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        datumContractArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChooseContract.setAdapter(datumContractArrayAdapter);
        datumContractArrayAdapter.addAll(contractType);
        spinnerChooseContract.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getContractName = contractType.get(position).getValue().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void setProblemType(final List<DatumProblem> problemType) {
        datumProblemArrayAdapter = new ArrayAdapter<DatumProblem>(this, android.R.layout.simple_spinner_item,
                android.R.id.text1);
        datumProblemArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChooseProblem.setAdapter(datumProblemArrayAdapter);
        datumProblemArrayAdapter.addAll(problemType);
        spinnerChooseProblem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getProblemName = problemType.get(position).getValue().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void setNewRequestCreated(ComplaintResponseCrm newRequestCreated) {
        CommonUtils.saveRequestNumber(this,newRequestCreated );
        String data = newRequestCreated.getData();
        Toast.makeText(this, "تم تسجيل الشكوى برقم"+ data, Toast.LENGTH_LONG).show();
        startActivity(new Intent(RequestComplaintActivity.this, MainScreenActivity.class));
    }
}

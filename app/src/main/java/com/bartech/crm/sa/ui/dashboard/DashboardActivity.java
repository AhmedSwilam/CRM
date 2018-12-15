package com.bartech.crm.sa.ui.dashboard;

import android.os.Bundle;
import android.widget.TextView;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.ComplaintCountResponse;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.data.network.model.VisitsCountResponse;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 6/18/2018.
 */

public class DashboardActivity extends BaseActivity implements DashboardMvpView {
    @Inject
    DashboardMvpPresenter<DashboardMvpView> mPresenter;
    @BindView(R.id.txt_client_name)
    TextView txtClientName;
    @BindView(R.id.txt_client_type)
    TextView txtClientType;
    @BindView(R.id.txt_visits_count)
    TextView txtVisitCount;
    @BindView(R.id.txt_complaint_count)
    TextView txtComplaintCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String clientName = loginResponseCrm.getData().getNameAr();
        String clientType = loginResponseCrm.getData().getTypeId().toString();
        String clientId = loginResponseCrm.getData().getId().toString();
        mPresenter.onAttach(DashboardActivity.this);
        txtClientName.setText(clientName);
        txtClientType.setText(clientType);
        mPresenter.getRequestsCount(clientId);
        mPresenter.getVisitsCount(clientId);

    }

    @Override
    protected void setUp() {

    }

//    @Override
//    public void getSavedUserObject(LoginResponseCrm loginResponseCrm) {
//        CommonUtils.saveUser(this, loginResponseCrm);
//
//    }

    @Override
    public void setRequestsCount(ComplaintCountResponse requestsCount) {
        txtComplaintCount.setText(requestsCount.getData());
    }

    @Override
    public void setVisitsCount(VisitsCountResponse visitsCount) {
        txtVisitCount.setText(visitsCount.getData());
    }
}

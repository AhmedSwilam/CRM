package com.bartech.crm.sa.ui.myvisits;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.GetVisitsRecyclerAdapter;
import com.bartech.crm.sa.data.network.model.GetAllVisitsResponse;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 6/11/2018.
 */

public class MyVisitsActivity extends BaseActivity implements MyVisitsMvpView {

    @Inject
    MyVisitsMvpPresenter<MyVisitsMvpView> mPresenter;
    private GetVisitsRecyclerAdapter mRecyclerAdapter;
    private ArrayList<GetAllVisitsResponse> allVisitsResponseArrayList;
    @BindView(R.id.recycler_get_visits)
    RecyclerView getRecyclerView;
    @BindView(R.id.txt_no_visits_data)
    TextView txtNoVisitData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_visits);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MyVisitsActivity.this);
        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String clientId = loginResponseCrm.getData().getId().toString();
        mPresenter.getAllVisits(clientId);
        allVisitsResponseArrayList = new ArrayList<>();
        txtNoVisitData.setVisibility(View.INVISIBLE);

    }


    @Override
    protected void setUp() {
    }

    @Override
    public void setAllVisits(GetAllVisitsResponse allVisits) {
        if (allVisitsResponseArrayList.size()!=0){
            allVisitsResponseArrayList = new ArrayList<GetAllVisitsResponse>();
            mRecyclerAdapter = new GetVisitsRecyclerAdapter(MyVisitsActivity.this, allVisitsResponseArrayList);
            getRecyclerView.setAdapter(mRecyclerAdapter);
            getRecyclerView.setHasFixedSize(true);
            getRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }else {
            txtNoVisitData.setVisibility(View.VISIBLE);
        }

    }
}

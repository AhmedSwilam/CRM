package com.bartech.crm.sa.ui.allcomplaint;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.DatumGetAllRequests;
import com.bartech.crm.sa.data.network.model.GetRequestsRecyclerAdapter;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.ui.requestcomplaint.RequestComplaintActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 6/8/2018.
 */

public class MyComplaintsActivity extends BaseActivity implements MyComplaintsMvpView {

    @Inject
    MyComplaintsMvpPresenter<MyComplaintsMvpView> mPresenter;
    private GetRequestsRecyclerAdapter mRecyclerAdapter;
    private ArrayList<DatumGetAllRequests> datumGetAllRequests;
    SwipeController swipeController = null;
    @BindView(R.id.recycler_get_requests)
    RecyclerView getRecyclerView;
    @BindView(R.id.img_add_new_request)
    ImageView imgAddNewRequest;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.drawerlayout)
    DrawerLayout mDrawer;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_requests);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MyComplaintsActivity.this);

        datumGetAllRequests = new ArrayList<>();

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String clientId = loginResponseCrm.getData().getId().toString();

        mPresenter.getAllRequests(clientId);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void setUp() {
        setSupportActionBar(mToolbar);
        mToggle = new ActionBarDrawerToggle(
                this,
                mDrawer,
                mToolbar,
                R.string.open_drawer,
                R.string.close_drawer) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                hideKeyboard();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();

    }
    @OnClick(R.id.img_add_new_request)
    public void onAddButtonClicked(){
        startActivity(new Intent(MyComplaintsActivity.this, RequestComplaintActivity.class));
    }


    @Override
    public void setAllRequests(List<DatumGetAllRequests> allRequests) {
        datumGetAllRequests = new ArrayList<DatumGetAllRequests>(allRequests);
        mRecyclerAdapter = new GetRequestsRecyclerAdapter(MyComplaintsActivity.this, datumGetAllRequests);
        getRecyclerView.setHasFixedSize(true);
        getRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        getRecyclerView.setAdapter(mRecyclerAdapter);
        swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                mRecyclerAdapter.getAllComplaint.remove(position);
                mRecyclerAdapter.notifyItemRemoved(position);
                mRecyclerAdapter.notifyItemRangeChanged(position, mRecyclerAdapter.getItemCount());
            }
        });

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
        itemTouchhelper.attachToRecyclerView(getRecyclerView);

        getRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                swipeController.onDraw(c);
            }
        });
    }
}

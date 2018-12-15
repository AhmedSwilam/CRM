package com.bartech.crm.sa.ui.mydevices;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.network.model.DatumDevices;
import com.bartech.crm.sa.data.network.model.GetDevicesRecyclerAdapter;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.allcomplaint.MyComplaintsActivity;
import com.bartech.crm.sa.ui.base.BaseActivity;
import com.bartech.crm.sa.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 6/11/2018.
 */

public class MyDevicesActivity extends BaseActivity implements MyDevicesMvpView {

    @Inject
    MyDevicesMvpPresenter<MyDevicesMvpView> mPresenter;
    private GetDevicesRecyclerAdapter mRecyclerAdapter;
    private ArrayList<DatumDevices> datumGetAllDevices;
    @BindView(R.id.recycler_get_requests)
    RecyclerView getRecyclerView;
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
        setContentView(R.layout.activity_get_all_devices);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(MyDevicesActivity.this);
        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String clientId = loginResponseCrm.getData().getId().toString();
        mPresenter.getAllDevices(clientId);
        datumGetAllDevices = new ArrayList<>();
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
            setupNavMenu();
            mPresenter.onNavMenuCreated();
            mPresenter.onViewInitialized();
    }
    public void setupNavMenu() {
        View headerLayout = mNavigationView.getHeaderView(0);
        mNavigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        mDrawer.closeDrawer(GravityCompat.START);
                        switch (item.getItemId()) {
                            case R.id.nav_mainscreen_mycomplaint:
                                mPresenter.onMyComplaintItemClicked();
                                return true;
                            case R.id.nav_mainscreen_mydevice:
                                mPresenter.onMyDevicesItemClicked();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
    }

    @Override
    public void setAllDevices(List<DatumDevices> allDevices) {
        datumGetAllDevices = new ArrayList<DatumDevices>(allDevices);
        mRecyclerAdapter = new GetDevicesRecyclerAdapter(MyDevicesActivity.this,datumGetAllDevices);
        getRecyclerView.setAdapter(mRecyclerAdapter);
        getRecyclerView.setHasFixedSize(true);
        getRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void goToMyComplaintActivity() {
        startActivity(new Intent(MyDevicesActivity.this, MyComplaintsActivity.class));
    }
}

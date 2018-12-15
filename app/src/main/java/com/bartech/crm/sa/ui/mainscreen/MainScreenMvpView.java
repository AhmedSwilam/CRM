package com.bartech.crm.sa.ui.mainscreen;

import com.bartech.crm.sa.ui.base.MvpView;

/**
 * Created by Ahmed on 6/3/2018.
 */

public interface MainScreenMvpView extends MvpView  {

    void goToMyComplaintActivity();
    void goToMyDevicesActivity();
    void goToMyVisitsActivity();
    void goToMyDashboardActivity();
    void goToMySettingActivity();
}

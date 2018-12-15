package com.bartech.crm.sa.ui.mydevices;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/11/2018.
 */

public interface MyDevicesMvpPresenter <V extends MyDevicesMvpView> extends MvpPresenter<V> {

    void getAllDevices(String ClientId);
    void onNavMenuCreated();
    void onViewInitialized();
    void onMyComplaintItemClicked();
    void onMyDevicesItemClicked();
}

package com.bartech.crm.sa.ui.mydevices;

import com.bartech.crm.sa.data.network.model.DatumDevices;
import com.bartech.crm.sa.ui.base.MvpView;

import java.util.List;

/**
 * Created by Ahmed on 6/11/2018.
 */

public interface MyDevicesMvpView extends MvpView {

    void setAllDevices(List<DatumDevices> allDevices);
    void goToMyComplaintActivity();
}

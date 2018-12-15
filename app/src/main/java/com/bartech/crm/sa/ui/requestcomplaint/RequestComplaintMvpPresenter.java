package com.bartech.crm.sa.ui.requestcomplaint;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/4/2018.
 */

public interface RequestComplaintMvpPresenter<V extends RequestComplaintMvpView> extends MvpPresenter<V> {

    void getDeviceName();

    void getFrequencyType();

    void getWarrantyType();

    void getContractType();

    void getProblemType();

    void onCreateRequestButtonClicked(String clientId, String deviceId, String problemId, String problemFrequencyId, String date,
                                      String firstTime, String secondTime, String thirdTime, String warrantyStartDate);
}

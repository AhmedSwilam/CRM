package com.bartech.crm.sa.ui.allcomplaint;

import com.bartech.crm.sa.data.network.model.DatumGetAllRequests;
import com.bartech.crm.sa.ui.base.MvpView;

import java.util.List;

/**
 * Created by Ahmed on 6/8/2018.
 */

public interface MyComplaintsMvpView extends MvpView {

    void setAllRequests(List<DatumGetAllRequests> allRequests);
}

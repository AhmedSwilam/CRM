package com.bartech.crm.sa.ui.allcomplaint;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/8/2018.
 */

public interface MyComplaintsMvpPresenter <V extends MyComplaintsMvpView> extends MvpPresenter<V> {

    void getAllRequests(String ClientId);
}

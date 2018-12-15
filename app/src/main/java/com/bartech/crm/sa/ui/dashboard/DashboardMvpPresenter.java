package com.bartech.crm.sa.ui.dashboard;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/18/2018.
 */

public interface DashboardMvpPresenter<V extends DashboardMvpView> extends MvpPresenter<V> {

    void getRequestsCount(String clientId);

    void getVisitsCount(String clientId);
}

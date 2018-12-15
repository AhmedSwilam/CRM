package com.bartech.crm.sa.ui.dashboard;

import com.bartech.crm.sa.data.network.model.ComplaintCountResponse;
import com.bartech.crm.sa.data.network.model.VisitsCountResponse;
import com.bartech.crm.sa.ui.base.MvpView;

/**
 * Created by Ahmed on 6/18/2018.
 */

public interface DashboardMvpView extends MvpView {

//    void getSavedUserObject(LoginResponseCrm loginResponseCrm);

    void setRequestsCount(ComplaintCountResponse requestsCount);

    void setVisitsCount(VisitsCountResponse visitsCount);
}

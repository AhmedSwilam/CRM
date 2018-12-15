package com.bartech.crm.sa.ui.myvisits;

import com.bartech.crm.sa.data.network.model.GetAllVisitsResponse;
import com.bartech.crm.sa.ui.base.MvpView;

/**
 * Created by Ahmed on 6/11/2018.
 */

public interface MyVisitsMvpView extends MvpView {

    void setAllVisits(GetAllVisitsResponse allVisits);
}

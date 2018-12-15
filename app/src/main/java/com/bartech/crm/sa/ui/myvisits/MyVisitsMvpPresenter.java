package com.bartech.crm.sa.ui.myvisits;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/11/2018.
 */

public interface MyVisitsMvpPresenter<V extends MyVisitsMvpView> extends MvpPresenter<V> {

    void getAllVisits(String ClientId);
}

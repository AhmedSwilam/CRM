package com.bartech.crm.sa.ui.login;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 5/23/2018.
 */

public interface LoginMvpPresenter <V extends LoginMvpView> extends MvpPresenter<V> {

    void onServerLoginClicked(String UserName, String Password);
}

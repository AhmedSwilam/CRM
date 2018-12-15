package com.bartech.crm.sa.ui.login;

import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.MvpView;

/**
 * Created by Ahmed on 5/23/2018.
 */

public interface LoginMvpView extends MvpView {

    void openMainScreen();

    void saveLoginResponseCrm(LoginResponseCrm loginResponseCrm);

}

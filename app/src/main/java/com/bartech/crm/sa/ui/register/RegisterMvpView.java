package com.bartech.crm.sa.ui.register;

import com.bartech.crm.sa.data.network.model.DatumClient;
import com.bartech.crm.sa.data.network.model.RegistrationResponse;
import com.bartech.crm.sa.ui.base.MvpView;

import java.util.List;

/**
 * Created by Ahmed on 5/24/2018.
 */

public interface RegisterMvpView extends MvpView {
    void setClientType(List<DatumClient> datumClientClientList);
    void openLandingActivity();
    void setNewUserRegisterd(RegistrationResponse registrationResponse);
}

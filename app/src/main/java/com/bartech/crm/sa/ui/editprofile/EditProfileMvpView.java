package com.bartech.crm.sa.ui.editprofile;

import com.bartech.crm.sa.data.network.model.EditProfileResponse;
import com.bartech.crm.sa.ui.base.MvpView;

/**
 * Created by Ahmed on 7/12/2018.
 */

public interface EditProfileMvpView extends MvpView {
    void setEditProfile(EditProfileResponse editProfile);
}

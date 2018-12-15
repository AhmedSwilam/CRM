package com.bartech.crm.sa.ui.editprofile;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 7/12/2018.
 */

public interface EditProfileMvpPresenter <V extends EditProfileMvpView> extends MvpPresenter<V> {

    void EditUserProfile(String UserId);
}

package com.bartech.crm.sa.ui.register;

import com.bartech.crm.sa.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 5/24/2018.
 */

public interface RegisterMvpPresenter <V extends RegisterMvpView> extends MvpPresenter<V> {
    void getClientType();
    void onButtonRegisterClicked(int typeId, String nameAr, String nameEn, String userName, String address,
                                 String companyName, String email,
                                 String mobile1,String mobile2, String landLine1, String landLine2,String note,String password);
}

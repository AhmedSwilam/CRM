package com.bartech.crm.sa.ui.login;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.R;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.LoginRequestCrm;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 5/23/2018.
 */

public class LoginPresenter <V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V>{
    @Inject
    public LoginPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onServerLoginClicked(final String UserName, final String Password) {

            if (UserName == null && UserName.isEmpty()){
                getMvpView().onError(R.string.empty_email);
            }
            if (Password== null && Password.isEmpty()){
                getMvpView().onError(R.string.empty_password);
            }
            getCompositeDisposable().add(getDataManager()
            .doServerLoginApiCallCrm(new LoginRequestCrm.serverLoginRequestCrm(UserName,Password))
            .subscribeOn(getSchedulerProvider().io())
            .observeOn(getSchedulerProvider().ui())
            .subscribe(new Consumer<LoginResponseCrm>() {
                @Override
                public void accept(LoginResponseCrm loginResponseCrm) throws Exception {
                    if (loginResponseCrm.getData()!=null){
                        getMvpView().saveLoginResponseCrm(loginResponseCrm);
                        getMvpView().openMainScreen();

                    }
                }
            }, new Consumer<Throwable>() {
                @Override
                public void accept(Throwable throwable) throws Exception {

                    if (!isViewAttached()) {
                        return;
                    }

                    getMvpView().hideLoading();

                    // handle the login error here
                    if (throwable instanceof ANError) {
                        ANError anError = (ANError) throwable;
                        handleApiError(anError);
                    }
                }
            }));

    }
}

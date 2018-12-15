package com.bartech.crm.sa.ui.register;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.ClientTypeIDResponse;
import com.bartech.crm.sa.data.network.model.RegistrationResponse;
import com.bartech.crm.sa.data.network.model.UserRegistrationRequest;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 5/24/2018.
 */

public class RegisterPresenter<V extends RegisterMvpView> extends BasePresenter<V> implements RegisterMvpPresenter<V> {
    @Inject
    public RegisterPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getClientType() {
        getCompositeDisposable().add(getDataManager()
                .doServerGetClientTypeCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<ClientTypeIDResponse>() {
                    @Override
                    public void accept(ClientTypeIDResponse clientResponseCrm) throws Exception {
                        if (clientResponseCrm.getData()!=null){
                            getMvpView().setClientType(clientResponseCrm.getData());
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

    @Override
    public void onButtonRegisterClicked(int typeId, String nameAr, String nameEn, String userName, String address,
                                        String companyName, String email, String mobile1, String mobile2, String landLine1,
                                        String landLine2, String note, String password) {
        getCompositeDisposable().add(getDataManager()
                .doServerCreateAccount(new UserRegistrationRequest.serverUserRegistrationRequest(typeId,nameAr,nameEn,userName,address,
                        companyName,email,mobile1,mobile2,landLine1,landLine2,note,password))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<RegistrationResponse>() {
                    @Override
                    public void accept(RegistrationResponse userRegistrationResponse) throws Exception {
                        if (userRegistrationResponse.getData().equalsIgnoreCase("True")){
                            getMvpView().setNewUserRegisterd(userRegistrationResponse);

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

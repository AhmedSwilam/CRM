package com.bartech.crm.sa.ui.allcomplaint;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.GetAllComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/8/2018.
 */

public class MyComplaintsPresenter <V extends MyComplaintsMvpView> extends BasePresenter<V> implements MyComplaintsMvpPresenter<V> {
    @Inject
    public MyComplaintsPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getAllRequests(String ClientId) {
        getCompositeDisposable().add(getDataManager()
                .doServerGetAllRequests(new GetAllDataByClientId.serverGetAllDataByClientId(ClientId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<GetAllComplaintResponseCrm>() {
                    @Override
                    public void accept(GetAllComplaintResponseCrm getAllComplaintResponseCrm) throws Exception {
                        if (getAllComplaintResponseCrm.getData()!=null){
                            getMvpView().setAllRequests(getAllComplaintResponseCrm.getData());
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

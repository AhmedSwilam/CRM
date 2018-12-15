package com.bartech.crm.sa.ui.mydevices;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.data.network.model.GetAllDevicesResponseCrm;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/11/2018.
 */

public class MyDevicesPresenter <V extends MyDevicesMvpView> extends BasePresenter<V> implements MyDevicesMvpPresenter<V> {
    @Inject
    public MyDevicesPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getAllDevices(String ClientId) {
        getCompositeDisposable().add(getDataManager()
                .doServerGetAllDevices(new GetAllDataByClientId.serverGetAllDataByClientId(ClientId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<GetAllDevicesResponseCrm>() {
                    @Override
                    public void accept(GetAllDevicesResponseCrm getAllDevicesResponseCrm) throws Exception {
                        if (getAllDevicesResponseCrm.getData()!=null){
                            getMvpView().setAllDevices(getAllDevicesResponseCrm.getData());
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
    public void onNavMenuCreated() {

    }

    @Override
    public void onViewInitialized() {

    }

    @Override
    public void onMyComplaintItemClicked() {

    }

    @Override
    public void onMyDevicesItemClicked() {
        getMvpView().goToMyComplaintActivity();
    }
}

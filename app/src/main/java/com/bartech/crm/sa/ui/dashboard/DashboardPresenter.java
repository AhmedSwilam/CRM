package com.bartech.crm.sa.ui.dashboard;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.ComplaintCountResponse;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.data.network.model.VisitsCountResponse;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/18/2018.
 */

public class DashboardPresenter  <V extends DashboardMvpView> extends BasePresenter<V> implements DashboardMvpPresenter<V> {
    @Inject
    public DashboardPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getRequestsCount(String clientId) {
        getCompositeDisposable().add(getDataManager()
        .doServerGetComplaintCount(new GetAllDataByClientId.serverGetAllDataByClientId(clientId))
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<ComplaintCountResponse>() {
            @Override
            public void accept(ComplaintCountResponse complaintCountResponse) throws Exception {
                if (complaintCountResponse.getData()!=null){
                    getMvpView().setRequestsCount(complaintCountResponse);
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
    public void getVisitsCount(String clientId) {
        getCompositeDisposable().add(getDataManager()
                .doServerGetVisitsCount(new GetAllDataByClientId.serverGetAllDataByClientId(clientId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<VisitsCountResponse>() {
                    @Override
                    public void accept(VisitsCountResponse visitsCountResponse) throws Exception {
                        if (visitsCountResponse.getData()!=null){
                            getMvpView().setVisitsCount(visitsCountResponse);
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

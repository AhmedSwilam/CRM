package com.bartech.crm.sa.ui.myvisits;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.data.network.model.GetAllVisitsResponse;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/11/2018.
 */

public class MyVisitsPresenter  <V extends MyVisitsMvpView> extends BasePresenter<V> implements MyVisitsMvpPresenter<V> {
    @Inject
    public MyVisitsPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getAllVisits(String ClientId) {
        getCompositeDisposable().add(getDataManager()
                .doServerGetAllVisits(new GetAllDataByClientId.serverGetAllDataByClientId(ClientId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<GetAllVisitsResponse>() {
                    @Override
                    public void accept(GetAllVisitsResponse getAllVisitsResponse) throws Exception {
                        if (getAllVisitsResponse.getData()!=null){
                            getMvpView().setAllVisits(getAllVisitsResponse);
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

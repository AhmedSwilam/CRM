package com.bartech.crm.sa.ui.requestcomplaint;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.ComplaintRequestCrm;
import com.bartech.crm.sa.data.network.model.ComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.ContractTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.FrequencyTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.GetDeviceResponseCrm;
import com.bartech.crm.sa.data.network.model.ProblemTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.WarrantyTypeResponseCrm;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/4/2018.
 */

public class RequestComplaintPresenter<V extends RequestComplaintMvpView> extends BasePresenter<V> implements RequestComplaintMvpPresenter<V> {
    @Inject
    public RequestComplaintPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getDeviceName() {
        getCompositeDisposable().add(getDataManager()
        .doServerGetDeviceApiCall()
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<GetDeviceResponseCrm>() {
            @Override
            public void accept(GetDeviceResponseCrm getDeviceResponseCrm) throws Exception {
                if (getDeviceResponseCrm.getData()!=null){
                    getMvpView().setDeviceName(getDeviceResponseCrm.getData());
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
    public void getFrequencyType() {
        getCompositeDisposable().add(getDataManager()
        .doServerGetFrequencyTypeApiCall()
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<FrequencyTypeResponseCrm>() {
            @Override
            public void accept(FrequencyTypeResponseCrm frequencyTypeResponseCrm) throws Exception {
                if (frequencyTypeResponseCrm.getData()!=null){
                    getMvpView().setFrequencyType(frequencyTypeResponseCrm.getData());
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
    public void getWarrantyType() {
        getCompositeDisposable().add(getDataManager()
        .doServerWarrantyApiCall()
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<WarrantyTypeResponseCrm>() {
            @Override
            public void accept(WarrantyTypeResponseCrm warrantyTypeResponseCrm) throws Exception {
                if (warrantyTypeResponseCrm.getData()!=null){
                    getMvpView().setWarrantyType(warrantyTypeResponseCrm.getData());
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
    public void getContractType() {
        getCompositeDisposable().add(getDataManager()
                .doServerContractApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<ContractTypeResponseCrm>() {
                    @Override
                    public void accept(ContractTypeResponseCrm contractTypeResponseCrm) throws Exception {
                        if (contractTypeResponseCrm.getData()!=null){
                            getMvpView().setContractType(contractTypeResponseCrm.getData());
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
    public void getProblemType() {
        getCompositeDisposable().add(getDataManager()
                .doServerGetProblemTypeApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<ProblemTypeResponseCrm>() {
                    @Override
                    public void accept(ProblemTypeResponseCrm problemTypeResponseCrm) throws Exception {
                        if (problemTypeResponseCrm.getData()!=null){
                            getMvpView().setProblemType(problemTypeResponseCrm.getData());
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
    public void onCreateRequestButtonClicked(String clientId, String deviceId, String problemId, String problemFrequencyId, String date,
                                             String firstTime, String secondTime, String thirdTime,String warrantyStartDate) {
        getCompositeDisposable().add(getDataManager()
                .doServerCreateRequest(new ComplaintRequestCrm.serverComplaintRequestCrm(clientId,deviceId,problemId,
                        problemFrequencyId,date,firstTime,secondTime,thirdTime,warrantyStartDate))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<ComplaintResponseCrm>() {
                    @Override
                    public void accept(ComplaintResponseCrm complaintResponseCrm) throws Exception {
                        if (complaintResponseCrm.getData()!=null){
                            getMvpView().setNewRequestCreated(complaintResponseCrm);
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

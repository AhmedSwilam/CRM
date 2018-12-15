package com.bartech.crm.sa.ui.editprofile;

import com.androidnetworking.error.ANError;
import com.bartech.crm.sa.data.DataManager;
import com.bartech.crm.sa.data.network.model.EditProfileResponse;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.ui.base.BasePresenter;
import com.bartech.crm.sa.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 7/12/2018.
 */

public class EditProfilePresenter <V extends EditProfileMvpView> extends BasePresenter<V> implements EditProfileMvpPresenter<V> {
    @Inject
    public EditProfilePresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void EditUserProfile(String UserId) {
        getCompositeDisposable().add(getDataManager()
                .doServerEditProfile(new GetAllDataByClientId.serverGetAllDataByClientId(UserId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<EditProfileResponse>() {
                    @Override
                    public void accept(EditProfileResponse editProfileResponse) throws Exception {
                        if (editProfileResponse.getData()!=null){
                            getMvpView().setEditProfile(editProfileResponse);
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

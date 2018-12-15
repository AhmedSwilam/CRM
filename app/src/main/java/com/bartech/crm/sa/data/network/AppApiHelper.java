/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.bartech.crm.sa.data.network;

import com.bartech.crm.sa.data.network.model.BlogResponse;
import com.bartech.crm.sa.data.network.model.ClientTypeIDResponse;
import com.bartech.crm.sa.data.network.model.ComplaintCountResponse;
import com.bartech.crm.sa.data.network.model.ComplaintRequestCrm;
import com.bartech.crm.sa.data.network.model.ComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.ContractTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.EditProfileResponse;
import com.bartech.crm.sa.data.network.model.FrequencyTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.GetAllComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.GetAllDataByClientId;
import com.bartech.crm.sa.data.network.model.GetDeviceResponseCrm;
import com.bartech.crm.sa.data.network.model.LoginRequest;
import com.bartech.crm.sa.data.network.model.LoginRequestCrm;
import com.bartech.crm.sa.data.network.model.LoginResponse;
import com.bartech.crm.sa.data.network.model.LoginResponseCrm;
import com.bartech.crm.sa.data.network.model.LogoutResponse;
import com.bartech.crm.sa.data.network.model.GetAllDevicesResponseCrm;
import com.bartech.crm.sa.data.network.model.OpenSourceResponse;
import com.bartech.crm.sa.data.network.model.ProblemTypeResponseCrm;
import com.bartech.crm.sa.data.network.model.RegistrationResponse;
import com.bartech.crm.sa.data.network.model.UserRegistrationRequest;
import com.bartech.crm.sa.data.network.model.VisitsCountResponse;
import com.bartech.crm.sa.data.network.model.GetAllVisitsResponse;
import com.bartech.crm.sa.data.network.model.WarrantyTypeResponseCrm;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

/**
 * Created by janisharali on 28/01/17.
 */

@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }

    @Override
    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest
                                                              request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest
                                                                request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

//    @Override
//    public Single<LoginResponse> doServerLoginApiCallCrm(LoginRequest.ServerLoginRequest
//                                                              request) {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
//                .addHeaders(mApiHeader.getPublicApiHeader())
//                .addBodyParameter(request)
//                .build()
//                .getObjectSingle(LoginResponse.class);
//    }

    @Override
    public Single<LogoutResponse> doLogoutApiCall() {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(LogoutResponse.class);
    }

    @Override
    public Single<LoginResponseCrm> doServerLoginApiCallCrm(LoginRequestCrm.serverLoginRequestCrm loginRequestCrm) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGIN)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addBodyParameter(loginRequestCrm)
                .build()
                .getObjectSingle(LoginResponseCrm.class);
    }

    @Override
    public Single<ClientTypeIDResponse> doServerGetClientTypeCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_CLIENT_TYPE)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(ClientTypeIDResponse.class);
    }

    @Override
    public Single<GetDeviceResponseCrm> doServerGetDeviceApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_DEVICE)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(GetDeviceResponseCrm.class);
    }

    @Override
    public Single<FrequencyTypeResponseCrm> doServerGetFrequencyTypeApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_FREQUENCY)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(FrequencyTypeResponseCrm.class);
    }

    @Override
    public Single<ProblemTypeResponseCrm> doServerGetProblemTypeApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_PROBLEM)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(ProblemTypeResponseCrm.class);
    }

    @Override
    public Single<WarrantyTypeResponseCrm> doServerWarrantyApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_WARRANTY)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(WarrantyTypeResponseCrm.class);
    }

    @Override
    public Single<ContractTypeResponseCrm> doServerContractApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_CONTRACT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(ContractTypeResponseCrm.class);
    }

    @Override
    public Single<RegistrationResponse> doServerCreateAccount(UserRegistrationRequest.serverUserRegistrationRequest userRegistrationRequest) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_CREATE_ACCOUNT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addBodyParameter(userRegistrationRequest)
                .build()
                .getObjectSingle(RegistrationResponse.class);
    }

    @Override
    public Single<ComplaintResponseCrm> doServerCreateRequest(ComplaintRequestCrm.serverComplaintRequestCrm serverComplaintRequestCrm) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_CREATE_REQUEST_RESPONSE)
                .addBodyParameter(serverComplaintRequestCrm)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(ComplaintResponseCrm.class);
    }

    @Override
    public Single<GetAllComplaintResponseCrm> doServerGetAllRequests(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_ALL_REQUESTS)
                .addQueryParameter(serverGetAllDataByClientId)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(GetAllComplaintResponseCrm.class);
    }

    @Override
    public Single<GetAllDevicesResponseCrm> doServerGetAllDevices(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_REQUEST_DEVICES)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(serverGetAllDataByClientId)
                .build()
                .getObjectSingle(GetAllDevicesResponseCrm.class);
    }

    @Override
    public Single<GetAllVisitsResponse> doServerGetAllVisits(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_ALL_VISITS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(serverGetAllDataByClientId)
                .build()
                .getObjectSingle(GetAllVisitsResponse.class);
    }

    @Override
    public Single<ComplaintCountResponse> doServerGetComplaintCount(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_REQUESTS_COUNT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(serverGetAllDataByClientId)
                .build()
                .getObjectSingle(ComplaintCountResponse.class);
    }

    @Override
    public Single<VisitsCountResponse> doServerGetVisitsCount(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_VISITS_COUNT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(serverGetAllDataByClientId)
                .build()
                .getObjectSingle(VisitsCountResponse.class);
    }

    @Override
    public Single<EditProfileResponse> doServerEditProfile(GetAllDataByClientId.serverGetAllDataByClientId editUserProfile) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_EDIT_PROFILE)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(editUserProfile)
                .build()
                .getObjectSingle(EditProfileResponse.class);
    }

    @Override
    public Single<BlogResponse> getBlogApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_BLOG)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(BlogResponse.class);
    }

    @Override
    public Single<OpenSourceResponse> getOpenSourceApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_OPEN_SOURCE)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(OpenSourceResponse.class);
    }
}


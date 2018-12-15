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

import io.reactivex.Single;

/**
 * Created by janisharali on 27/01/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

//    Single<LoginResponse> doServerLoginApiCallCrm(LoginRequest.ServerLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponseCrm> doServerLoginApiCallCrm(LoginRequestCrm.serverLoginRequestCrm loginRequestCrm);

    Single<ClientTypeIDResponse> doServerGetClientTypeCall();

    Single<GetDeviceResponseCrm> doServerGetDeviceApiCall();

    Single<FrequencyTypeResponseCrm> doServerGetFrequencyTypeApiCall();

    Single<ProblemTypeResponseCrm> doServerGetProblemTypeApiCall();

    Single<WarrantyTypeResponseCrm> doServerWarrantyApiCall();

    Single<ContractTypeResponseCrm> doServerContractApiCall();

    Single<RegistrationResponse> doServerCreateAccount(UserRegistrationRequest.serverUserRegistrationRequest userRegistrationRequest);

    Single<ComplaintResponseCrm> doServerCreateRequest(ComplaintRequestCrm.serverComplaintRequestCrm serverComplaintRequestCrm);

    Single<GetAllComplaintResponseCrm> doServerGetAllRequests(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId);

    Single<GetAllDevicesResponseCrm> doServerGetAllDevices(GetAllDataByClientId.serverGetAllDataByClientId getAllDataByClientId);

    Single<GetAllVisitsResponse> doServerGetAllVisits(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId);

    Single<ComplaintCountResponse> doServerGetComplaintCount(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId);

    Single<VisitsCountResponse> doServerGetVisitsCount(GetAllDataByClientId.serverGetAllDataByClientId serverGetAllDataByClientId);

    Single<EditProfileResponse>doServerEditProfile(GetAllDataByClientId.serverGetAllDataByClientId getAllDataByClientId);

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}

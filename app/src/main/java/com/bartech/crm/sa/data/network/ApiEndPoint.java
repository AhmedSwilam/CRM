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

import com.bartech.crm.sa.BuildConfig;

/**
 * Created by amitshekhar on 01/02/17.
 */

public final class ApiEndPoint {

    public static final String ENDPOINT_GOOGLE_LOGIN = BuildConfig.BASE_URL
            + "/588d14f4100000a9072d2943";

    public static final String ENDPOINT_FACEBOOK_LOGIN = BuildConfig.BASE_URL
            + "/588d15d3100000ae072d2944";

//    public static final String ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL
//            + "/588d15f5100000a8072d2945";

    public static final String ENDPOINT_LOGOUT = BuildConfig.BASE_URL
            + "/588d161c100000a9072d2946";

    public static final String ENDPOINT_BLOG = BuildConfig.BASE_URL
            + "/5926ce9d11000096006ccb30";

    public static final String ENDPOINT_LOGIN = "http://46.105.99.135:85/api/ManageAccount/Login";

    public static final String ENDPOINT_CLIENT_TYPE = "http://46.105.99.135:85/api/ManageClientApi/GetClientType";

    public static final String ENDPOINT_CREATE_ACCOUNT = " http://46.105.99.135:85/api/ManageClientApi/CreateClient";

    public static final String ENDPOINT_GET_DEVICE = "http://46.105.99.135:85/api/ManageRequestApi/GetDevices";

    public static final String ENDPOINT_GET_FREQUENCY = "http://46.105.99.135:85/api/ManageRequestApi/GetFrequencyType";

    public static final String ENDPOINT_GET_WARRANTY = "http://46.105.99.135:85/api/ManageRequestApi/GetWarrantyType";

    public static final String ENDPOINT_GET_CONTRACT = "http://46.105.99.135:85/api/ManageRequestApi/GetContractType";

    public static final String ENDPOINT_GET_PROBLEM = "http://46.105.99.135:85/api/ManageRequestApi/GetProblems";

    public static final String ENDPOINT_CREATE_REQUEST_RESPONSE = "http://46.105.99.135:85/api/ManageRequestApi/CreateRequest";

    public static final String ENDPOINT_GET_ALL_REQUESTS = "http://46.105.99.135:85/api/ManageRequestApi/GetClientRequests";

    public static final String ENDPOINT_GET_REQUEST_DEVICES = "http://46.105.99.135:85/api/ManageRequestApi/GetClientDevices";

    public static final String ENDPOINT_GET_ALL_VISITS = "http://46.105.99.135:85/api/ManageRequestApi/GetClientVisits";

    public static final String ENDPOINT_GET_REQUESTS_COUNT = " http://46.105.99.135:85/api/ManageRequestApi/GetClientRequestsCount";

    public static final String ENDPOINT_GET_VISITS_COUNT = " http://46.105.99.135:85/api/ManageRequestApi/GetClientVistsCount";

    public static final String ENDPOINT_EDIT_PROFILE = "http://46.105.99.135:85/api/ManageClientApi/GetClientProfile";

    public static final String ENDPOINT_OPEN_SOURCE = BuildConfig.BASE_URL
            + "/5926c34212000035026871cd";

    private ApiEndPoint() {
        // This class is not publicly instantiable
    }

}

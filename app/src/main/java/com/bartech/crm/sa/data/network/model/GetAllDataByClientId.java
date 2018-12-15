package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 6/20/2018.
 */

public class GetAllDataByClientId {

    public GetAllDataByClientId() {

    }
    public static class serverGetAllDataByClientId {
        @Expose
        @SerializedName("ClientId")
        private String ClientId;

        public serverGetAllDataByClientId(String clientId) {
            ClientId = clientId;
        }
    }




}

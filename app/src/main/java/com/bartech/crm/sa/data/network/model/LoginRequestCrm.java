package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 5/24/2018.
 */

public class LoginRequestCrm {
    private LoginRequestCrm() {

    }

    public static class serverLoginRequestCrm {
        @Expose
        @SerializedName("UserName")
        private String UserName;

        @Expose
        @SerializedName("Password")
        private String Password;

        public serverLoginRequestCrm(String userName, String password) {
            UserName = userName;
            Password = password;
        }
    }
}

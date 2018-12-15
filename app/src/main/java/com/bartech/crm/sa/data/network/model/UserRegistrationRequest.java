package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 6/2/2018.
 */

public class UserRegistrationRequest {
    public UserRegistrationRequest(){
    }
    public static class serverUserRegistrationRequest{
        @Expose
        @SerializedName("TypeId")
        private int TypeId;
        @Expose
        @SerializedName("NameAr")
        private String NameAr;
        @Expose
        @SerializedName("NameEn")
        private String NameEn;
        @Expose
        @SerializedName("UserName")
        private String UserName;
        @Expose
        @SerializedName("Address")
        private String Address;
        @Expose
        @SerializedName("CompanyName")
        private String CompanyName;
        @Expose
        @SerializedName("Email")
        private String Email;
        @Expose
        @SerializedName("Mobile1")
        private String Mobile1;
        @Expose
        @SerializedName("Mobile2")
        private String Mobile2;
        @Expose
        @SerializedName("LandLine1")
        private String LandLine1;
        @Expose
        @SerializedName("LandLine2")
        private String LandLine2;
        @Expose
        @SerializedName("Note")
        private String Note;
        @Expose
        @SerializedName("Password")
        private String Password;

        public serverUserRegistrationRequest(int typeId, String nameAr, String nameEn, String userName,
                                             String address, String companyName, String email, String mobile1, String mobile2,
                                             String landLine1, String landLine2, String note, String password) {
            TypeId = typeId;
            NameAr = nameAr;
            NameEn = nameEn;
            UserName = userName;
            Address = address;
            CompanyName = companyName;
            Email = email;
            Mobile1 = mobile1;
            Mobile2 = mobile2;
            LandLine1 = landLine1;
            LandLine2 = landLine2;
            Note = note;
            Password = password;
        }
    }
}

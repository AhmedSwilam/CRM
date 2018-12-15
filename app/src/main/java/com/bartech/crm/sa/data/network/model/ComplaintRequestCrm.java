package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 6/7/2018.
 */

public class ComplaintRequestCrm {
    public ComplaintRequestCrm(){
    }
    public static class serverComplaintRequestCrm{
        @Expose
        @SerializedName("ClientId")
        private String ClientId;
        @Expose
        @SerializedName("DeviceId")
        private String DeviceId;
        @Expose
        @SerializedName("ProblemId")
        private String ProblemId;
        @Expose
        @SerializedName("ProblemFrequencyId")
        private String ProblemFrequencyId;
        @Expose
        @SerializedName("Date")
        private String Date;
        @Expose
        @SerializedName("FirstTime")
        private String FirstTime;
        @Expose
        @SerializedName("SecondTime")
        private String SecondTime;
        @Expose
        @SerializedName("ThirdTime")
        private String ThirdTime;
        @Expose
        @SerializedName("WarrantyStartDate")
        private String WarrantyStartDate;

        public serverComplaintRequestCrm(String clientId, String deviceId, String problemId, String problemFrequencyId,
                                         String date, String firstTime, String secondTime, String thirdTime,
                                         String warrantyStartDate) {
            ClientId = clientId;
            DeviceId = deviceId;
            ProblemId = problemId;
            ProblemFrequencyId = problemFrequencyId;
            Date = date;
            FirstTime = firstTime;
            SecondTime = secondTime;
            ThirdTime = thirdTime;
            WarrantyStartDate = warrantyStartDate;
        }
    }
}

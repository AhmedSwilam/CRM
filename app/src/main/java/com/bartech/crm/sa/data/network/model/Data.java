
package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Data implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("NameAr")
    @Expose
    private String nameAr;
    @SerializedName("NameEn")
    @Expose
    private String nameEn;
    @SerializedName("Address")
    @Expose
    private Object address;
    @SerializedName("BranchId")
    @Expose
    private Integer branchId;
    @SerializedName("JobId")
    @Expose
    private Integer jobId;
    @SerializedName("Phone")
    @Expose
    private Object phone;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("JobName")
    @Expose
    private String jobName;
    @SerializedName("UserId")
    @Expose
    private Integer userId;
    @SerializedName("TypeId")
    @Expose
    private Integer typeId;
    @SerializedName("UserName")
    @Expose
    private Object userName;
    @SerializedName("Password")
    @Expose
    private Object password;
    @SerializedName("IsSystemAdmin")
    @Expose
    private Boolean isSystemAdmin;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("Name")
    @Expose
    private String name;
    private final static long serialVersionUID = -113686092290144179L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Boolean getIsSystemAdmin() {
        return isSystemAdmin;
    }

    public void setIsSystemAdmin(Boolean isSystemAdmin) {
        this.isSystemAdmin = isSystemAdmin;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

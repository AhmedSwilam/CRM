
package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DataEditProfile implements Serializable
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
    @SerializedName("TypeId")
    @Expose
    private Integer typeId;
    @SerializedName("TypeIdName")
    @Expose
    private Object typeIdName;
    @SerializedName("CompanyName")
    @Expose
    private String companyName;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Mobile1")
    @Expose
    private String mobile1;
    @SerializedName("Mobile2")
    @Expose
    private String mobile2;
    @SerializedName("LandLine1")
    @Expose
    private String landLine1;
    @SerializedName("LandLine2")
    @Expose
    private String landLine2;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Note")
    @Expose
    private String note;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("CreatedBy")
    @Expose
    private Integer createdBy;
    private final static long serialVersionUID = -938025646650791695L;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Object getTypeIdName() {
        return typeIdName;
    }

    public void setTypeIdName(Object typeIdName) {
        this.typeIdName = typeIdName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getLandLine1() {
        return landLine1;
    }

    public void setLandLine1(String landLine1) {
        this.landLine1 = landLine1;
    }

    public String getLandLine2() {
        return landLine2;
    }

    public void setLandLine2(String landLine2) {
        this.landLine2 = landLine2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

}

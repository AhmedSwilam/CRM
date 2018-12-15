
package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DatumDevices implements Serializable
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
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("TypeId")
    @Expose
    private Integer typeId;
    @SerializedName("TypeIdName")
    @Expose
    private Object typeIdName;
    @SerializedName("Name")
    @Expose
    private Object name;
    @SerializedName("CreatedBy")
    @Expose
    private Integer createdBy;
    private final static long serialVersionUID = 1757404315707106343L;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

}

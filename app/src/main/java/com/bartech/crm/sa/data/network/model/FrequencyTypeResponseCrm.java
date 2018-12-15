
package com.bartech.crm.sa.data.network.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FrequencyTypeResponseCrm implements Serializable
{

    @SerializedName("ContentEncoding")
    @Expose
    private Object contentEncoding;
    @SerializedName("ContentType")
    @Expose
    private Object contentType;
    @SerializedName("Data")
    @Expose
    private List<DatumFrequency> data = null;
    @SerializedName("JsonRequestBehavior")
    @Expose
    private Integer jsonRequestBehavior;
    @SerializedName("MaxJsonLength")
    @Expose
    private Object maxJsonLength;
    @SerializedName("RecursionLimit")
    @Expose
    private Object recursionLimit;
    private final static long serialVersionUID = -7075397199691318712L;

    public Object getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(Object contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public Object getContentType() {
        return contentType;
    }

    public void setContentType(Object contentType) {
        this.contentType = contentType;
    }

    public List<DatumFrequency> getData() {
        return data;
    }

    public void setData(List<DatumFrequency> data) {
        this.data = data;
    }

    public Integer getJsonRequestBehavior() {
        return jsonRequestBehavior;
    }

    public void setJsonRequestBehavior(Integer jsonRequestBehavior) {
        this.jsonRequestBehavior = jsonRequestBehavior;
    }

    public Object getMaxJsonLength() {
        return maxJsonLength;
    }

    public void setMaxJsonLength(Object maxJsonLength) {
        this.maxJsonLength = maxJsonLength;
    }

    public Object getRecursionLimit() {
        return recursionLimit;
    }

    public void setRecursionLimit(Object recursionLimit) {
        this.recursionLimit = recursionLimit;
    }

}

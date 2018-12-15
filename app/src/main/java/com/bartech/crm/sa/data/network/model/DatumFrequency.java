
package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DatumFrequency implements Serializable
{

    @SerializedName("Value")
    @Expose
    private Integer value;
    @SerializedName("Text")
    @Expose
    private String text;
    private final static long serialVersionUID = -9162607169293924017L;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

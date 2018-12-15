
package com.bartech.crm.sa.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DatumGetAllRequests implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("WorkFlowRequestTypeId")
    @Expose
    private Integer workFlowRequestTypeId;
    @SerializedName("RequestTypeId")
    @Expose
    private Integer requestTypeId;
    @SerializedName("RequestTypeIdName")
    @Expose
    private String requestTypeIdName;
    @SerializedName("ClientId")
    @Expose
    private Integer clientId;
    @SerializedName("ClientIdName")
    @Expose
    private String clientIdName;
    @SerializedName("DeviceId")
    @Expose
    private Integer deviceId;
    @SerializedName("DeviceIdName")
    @Expose
    private String deviceIdName;
    @SerializedName("DeviceOther")
    @Expose
    private Object deviceOther;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Proplem")
    @Expose
    private String proplem;
    @SerializedName("ProblemId")
    @Expose
    private Integer problemId;
    @SerializedName("Comment")
    @Expose
    private Object comment;
    @SerializedName("ProblemFrequencyId")
    @Expose
    private Integer problemFrequencyId;
    @SerializedName("FrequencyName")
    @Expose
    private String frequencyName;
    @SerializedName("FirstTime")
    @Expose
    private String firstTime;
    @SerializedName("SecondTime")
    @Expose
    private String secondTime;
    @SerializedName("ThirdTime")
    @Expose
    private String thirdTime;
    @SerializedName("IsWarranty")
    @Expose
    private Boolean isWarranty;
    @SerializedName("WarrantyId")
    @Expose
    private Integer warrantyId;
    @SerializedName("WarrantyIdName")
    @Expose
    private Object warrantyIdName;
    @SerializedName("WarrantyStartDate")
    @Expose
    private String warrantyStartDate;
    @SerializedName("IsContract")
    @Expose
    private Boolean isContract;
    @SerializedName("ContractId")
    @Expose
    private Integer contractId;
    @SerializedName("ContractIdName")
    @Expose
    private Object contractIdName;
    @SerializedName("DepartmentId")
    @Expose
    private Integer departmentId;
    @SerializedName("DepartmentIdName")
    @Expose
    private Object departmentIdName;
    @SerializedName("Note")
    @Expose
    private Object note;
    @SerializedName("RequestPathId")
    @Expose
    private Integer requestPathId;
    @SerializedName("RequestOrderId")
    @Expose
    private Integer requestOrderId;
    @SerializedName("RequestStatusId")
    @Expose
    private Integer requestStatusId;
    @SerializedName("RequestStatusIdName")
    @Expose
    private String requestStatusIdName;
    @SerializedName("RequestCurruntStageId")
    @Expose
    private Integer requestCurruntStageId;
    @SerializedName("CurruntStageName")
    @Expose
    private String curruntStageName;
    @SerializedName("CreatedBy")
    @Expose
    private Integer createdBy;
    @SerializedName("ApproveNote")
    @Expose
    private Object approveNote;
    @SerializedName("ApproveNoteBefore")
    @Expose
    private Object approveNoteBefore;
    @SerializedName("TecnicalId")
    @Expose
    private Integer tecnicalId;
    @SerializedName("VisitDateId")
    @Expose
    private Integer visitDateId;
    @SerializedName("stageName")
    @Expose
    private Object stageName;
    @SerializedName("statusName")
    @Expose
    private Object statusName;
    @SerializedName("EmployeeName")
    @Expose
    private Object employeeName;
    @SerializedName("Description")
    @Expose
    private Object description;
    @SerializedName("VisitDate")
    @Expose
    private Object visitDate;
    private final static long serialVersionUID = 7657703634378429876L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkFlowRequestTypeId() {
        return workFlowRequestTypeId;
    }

    public void setWorkFlowRequestTypeId(Integer workFlowRequestTypeId) {
        this.workFlowRequestTypeId = workFlowRequestTypeId;
    }

    public Integer getRequestTypeId() {
        return requestTypeId;
    }

    public void setRequestTypeId(Integer requestTypeId) {
        this.requestTypeId = requestTypeId;
    }

    public String getRequestTypeIdName() {
        return requestTypeIdName;
    }

    public void setRequestTypeIdName(String requestTypeIdName) {
        this.requestTypeIdName = requestTypeIdName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientIdName() {
        return clientIdName;
    }

    public void setClientIdName(String clientIdName) {
        this.clientIdName = clientIdName;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceIdName() {
        return deviceIdName;
    }

    public void setDeviceIdName(String deviceIdName) {
        this.deviceIdName = deviceIdName;
    }

    public Object getDeviceOther() {
        return deviceOther;
    }

    public void setDeviceOther(Object deviceOther) {
        this.deviceOther = deviceOther;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProplem() {
        return proplem;
    }

    public void setProplem(String proplem) {
        this.proplem = proplem;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public Integer getProblemFrequencyId() {
        return problemFrequencyId;
    }

    public void setProblemFrequencyId(Integer problemFrequencyId) {
        this.problemFrequencyId = problemFrequencyId;
    }

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public String getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(String secondTime) {
        this.secondTime = secondTime;
    }

    public String getThirdTime() {
        return thirdTime;
    }

    public void setThirdTime(String thirdTime) {
        this.thirdTime = thirdTime;
    }

    public Boolean getIsWarranty() {
        return isWarranty;
    }

    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

    public Integer getWarrantyId() {
        return warrantyId;
    }

    public void setWarrantyId(Integer warrantyId) {
        this.warrantyId = warrantyId;
    }

    public Object getWarrantyIdName() {
        return warrantyIdName;
    }

    public void setWarrantyIdName(Object warrantyIdName) {
        this.warrantyIdName = warrantyIdName;
    }

    public String getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(String warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public Boolean getIsContract() {
        return isContract;
    }

    public void setIsContract(Boolean isContract) {
        this.isContract = isContract;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Object getContractIdName() {
        return contractIdName;
    }

    public void setContractIdName(Object contractIdName) {
        this.contractIdName = contractIdName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Object getDepartmentIdName() {
        return departmentIdName;
    }

    public void setDepartmentIdName(Object departmentIdName) {
        this.departmentIdName = departmentIdName;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public Integer getRequestPathId() {
        return requestPathId;
    }

    public void setRequestPathId(Integer requestPathId) {
        this.requestPathId = requestPathId;
    }

    public Integer getRequestOrderId() {
        return requestOrderId;
    }

    public void setRequestOrderId(Integer requestOrderId) {
        this.requestOrderId = requestOrderId;
    }

    public Integer getRequestStatusId() {
        return requestStatusId;
    }

    public void setRequestStatusId(Integer requestStatusId) {
        this.requestStatusId = requestStatusId;
    }

    public String getRequestStatusIdName() {
        return requestStatusIdName;
    }

    public void setRequestStatusIdName(String requestStatusIdName) {
        this.requestStatusIdName = requestStatusIdName;
    }

    public Integer getRequestCurruntStageId() {
        return requestCurruntStageId;
    }

    public void setRequestCurruntStageId(Integer requestCurruntStageId) {
        this.requestCurruntStageId = requestCurruntStageId;
    }

    public String getCurruntStageName() {
        return curruntStageName;
    }

    public void setCurruntStageName(String curruntStageName) {
        this.curruntStageName = curruntStageName;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Object getApproveNote() {
        return approveNote;
    }

    public void setApproveNote(Object approveNote) {
        this.approveNote = approveNote;
    }

    public Object getApproveNoteBefore() {
        return approveNoteBefore;
    }

    public void setApproveNoteBefore(Object approveNoteBefore) {
        this.approveNoteBefore = approveNoteBefore;
    }

    public Integer getTecnicalId() {
        return tecnicalId;
    }

    public void setTecnicalId(Integer tecnicalId) {
        this.tecnicalId = tecnicalId;
    }

    public Integer getVisitDateId() {
        return visitDateId;
    }

    public void setVisitDateId(Integer visitDateId) {
        this.visitDateId = visitDateId;
    }

    public Object getStageName() {
        return stageName;
    }

    public void setStageName(Object stageName) {
        this.stageName = stageName;
    }

    public Object getStatusName() {
        return statusName;
    }

    public void setStatusName(Object statusName) {
        this.statusName = statusName;
    }

    public Object getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Object employeeName) {
        this.employeeName = employeeName;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Object visitDate) {
        this.visitDate = visitDate;
    }

}

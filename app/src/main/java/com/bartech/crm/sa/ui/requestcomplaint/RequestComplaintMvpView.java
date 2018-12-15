package com.bartech.crm.sa.ui.requestcomplaint;

import com.bartech.crm.sa.data.network.model.ComplaintResponseCrm;
import com.bartech.crm.sa.data.network.model.DatumContract;
import com.bartech.crm.sa.data.network.model.DatumDevice;
import com.bartech.crm.sa.data.network.model.DatumFrequency;
import com.bartech.crm.sa.data.network.model.DatumProblem;
import com.bartech.crm.sa.data.network.model.DatumWarranty;
import com.bartech.crm.sa.ui.base.MvpView;

import java.util.List;

/**
 * Created by Ahmed on 6/4/2018.
 */

public interface RequestComplaintMvpView extends MvpView {

    void setDeviceName(List<DatumDevice> deviceName);

    void setFrequencyType(List<DatumFrequency> frequencyType);

    void setWarrantyType(List<DatumWarranty> warrantyType);

    void setContractType(List<DatumContract> contractType);

    void setProblemType(List<DatumProblem> problemType);

    void setNewRequestCreated(ComplaintResponseCrm newRequestCreated);
}

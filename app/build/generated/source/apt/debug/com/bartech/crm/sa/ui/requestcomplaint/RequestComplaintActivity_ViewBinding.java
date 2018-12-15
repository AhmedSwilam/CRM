// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.requestcomplaint;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RequestComplaintActivity_ViewBinding implements Unbinder {
  private RequestComplaintActivity target;

  private View view2131558611;

  @UiThread
  public RequestComplaintActivity_ViewBinding(RequestComplaintActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RequestComplaintActivity_ViewBinding(final RequestComplaintActivity target, View source) {
    this.target = target;

    View view;
    target.spinnerChooseDevice = Utils.findRequiredViewAsType(source, R.id.spinner_choose_device, "field 'spinnerChooseDevice'", SearchableSpinner.class);
    target.spinnerChooseRepeatProblem = Utils.findRequiredViewAsType(source, R.id.spinner_choose_repeat_problem, "field 'spinnerChooseRepeatProblem'", SearchableSpinner.class);
    target.spinnerChooseWarranty = Utils.findRequiredViewAsType(source, R.id.spinner_choose_warranty_type, "field 'spinnerChooseWarranty'", SearchableSpinner.class);
    target.spinnerChooseContract = Utils.findRequiredViewAsType(source, R.id.spinner_choose_contract_type, "field 'spinnerChooseContract'", SearchableSpinner.class);
    target.spinnerChooseProblem = Utils.findRequiredViewAsType(source, R.id.spinner_choose_problem_type, "field 'spinnerChooseProblem'", SearchableSpinner.class);
    target.txtClientId = Utils.findRequiredViewAsType(source, R.id.txt_client_id, "field 'txtClientId'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_create_request, "field 'btnCreateRequest' and method 'createNewRequest'");
    target.btnCreateRequest = Utils.castView(view, R.id.btn_create_request, "field 'btnCreateRequest'", Button.class);
    view2131558611 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.createNewRequest(p0);
      }
    });
    target.etDeviceName = Utils.findRequiredViewAsType(source, R.id.et_device_name, "field 'etDeviceName'", EditText.class);
    target.txtDeviceName = Utils.findRequiredViewAsType(source, R.id.txt_device, "field 'txtDeviceName'", TextView.class);
    target.etComments = Utils.findRequiredViewAsType(source, R.id.comments, "field 'etComments'", EditText.class);
    target.etRequestTime = Utils.findRequiredViewAsType(source, R.id.et_request_time, "field 'etRequestTime'", EditText.class);
    target.etFirstTime = Utils.findRequiredViewAsType(source, R.id.et_first_time, "field 'etFirstTime'", EditText.class);
    target.etSecondTime = Utils.findRequiredViewAsType(source, R.id.et_second_time, "field 'etSecondTime'", EditText.class);
    target.etThirdTime = Utils.findRequiredViewAsType(source, R.id.et_third_time, "field 'etThirdTime'", EditText.class);
    target.checkBoxWarranty = Utils.findRequiredViewAsType(source, R.id.checkbox_warranty, "field 'checkBoxWarranty'", CheckBox.class);
    target.etWarrantyStartDate = Utils.findRequiredViewAsType(source, R.id.et_warranty_start_date, "field 'etWarrantyStartDate'", EditText.class);
    target.txtWarranty = Utils.findRequiredViewAsType(source, R.id.txt_warranty, "field 'txtWarranty'", TextView.class);
    target.txtContractType = Utils.findRequiredViewAsType(source, R.id.txt_contract_type, "field 'txtContractType'", TextView.class);
    target.txtWarrantyStart = Utils.findRequiredViewAsType(source, R.id.txt_warranty_start, "field 'txtWarrantyStart'", TextView.class);
    target.txtNotes = Utils.findRequiredViewAsType(source, R.id.note, "field 'txtNotes'", TextView.class);
    target.checkBoxAgreement = Utils.findRequiredViewAsType(source, R.id.checkbox_agreement, "field 'checkBoxAgreement'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RequestComplaintActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.spinnerChooseDevice = null;
    target.spinnerChooseRepeatProblem = null;
    target.spinnerChooseWarranty = null;
    target.spinnerChooseContract = null;
    target.spinnerChooseProblem = null;
    target.txtClientId = null;
    target.btnCreateRequest = null;
    target.etDeviceName = null;
    target.txtDeviceName = null;
    target.etComments = null;
    target.etRequestTime = null;
    target.etFirstTime = null;
    target.etSecondTime = null;
    target.etThirdTime = null;
    target.checkBoxWarranty = null;
    target.etWarrantyStartDate = null;
    target.txtWarranty = null;
    target.txtContractType = null;
    target.txtWarrantyStart = null;
    target.txtNotes = null;
    target.checkBoxAgreement = null;

    view2131558611.setOnClickListener(null);
    view2131558611 = null;
  }
}

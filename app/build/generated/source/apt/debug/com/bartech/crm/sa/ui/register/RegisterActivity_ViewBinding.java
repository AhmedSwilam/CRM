// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.register;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  private View view2131558630;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(final RegisterActivity target, View source) {
    this.target = target;

    View view;
    target.clientSpinner = Utils.findRequiredViewAsType(source, R.id.clientspinner, "field 'clientSpinner'", SearchableSpinner.class);
    target.etFirstName = Utils.findRequiredViewAsType(source, R.id.et_firstname, "field 'etFirstName'", EditText.class);
    target.etLastName = Utils.findRequiredViewAsType(source, R.id.et_lastname, "field 'etLastName'", EditText.class);
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.et_user_name, "field 'etUserName'", EditText.class);
    target.etAddress = Utils.findRequiredViewAsType(source, R.id.et_address, "field 'etAddress'", EditText.class);
    target.etEmail = Utils.findRequiredViewAsType(source, R.id.et_email, "field 'etEmail'", EditText.class);
    target.etMobile1 = Utils.findRequiredViewAsType(source, R.id.et_mobile1, "field 'etMobile1'", EditText.class);
    target.etMobile2 = Utils.findRequiredViewAsType(source, R.id.et_mobile2, "field 'etMobile2'", EditText.class);
    target.etLandLine1 = Utils.findRequiredViewAsType(source, R.id.et_landline1, "field 'etLandLine1'", EditText.class);
    target.etLandLine2 = Utils.findRequiredViewAsType(source, R.id.et_landline2, "field 'etLandLine2'", EditText.class);
    target.etNote = Utils.findRequiredViewAsType(source, R.id.et_note, "field 'etNote'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password_register, "field 'etPassword'", EditText.class);
    target.etCompanyName = Utils.findRequiredViewAsType(source, R.id.et_company_name, "field 'etCompanyName'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_registration, "field 'btnRegister' and method 'onServerRegisterClicked'");
    target.btnRegister = Utils.castView(view, R.id.btn_registration, "field 'btnRegister'", Button.class);
    view2131558630 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServerRegisterClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.clientSpinner = null;
    target.etFirstName = null;
    target.etLastName = null;
    target.etUserName = null;
    target.etAddress = null;
    target.etEmail = null;
    target.etMobile1 = null;
    target.etMobile2 = null;
    target.etLandLine1 = null;
    target.etLandLine2 = null;
    target.etNote = null;
    target.etPassword = null;
    target.etCompanyName = null;
    target.btnRegister = null;

    view2131558630.setOnClickListener(null);
    view2131558630 = null;
  }
}

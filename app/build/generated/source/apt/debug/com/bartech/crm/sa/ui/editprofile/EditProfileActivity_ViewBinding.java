// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.editprofile;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditProfileActivity_ViewBinding implements Unbinder {
  private EditProfileActivity target;

  @UiThread
  public EditProfileActivity_ViewBinding(EditProfileActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditProfileActivity_ViewBinding(EditProfileActivity target, View source) {
    this.target = target;

    target.etNameAr = Utils.findRequiredViewAsType(source, R.id.edit_name_ar, "field 'etNameAr'", EditText.class);
    target.etNameEn = Utils.findRequiredViewAsType(source, R.id.edit_name_en, "field 'etNameEn'", EditText.class);
    target.etAddress = Utils.findRequiredViewAsType(source, R.id.edit_address, "field 'etAddress'", EditText.class);
    target.etPhone = Utils.findRequiredViewAsType(source, R.id.edit_phone, "field 'etPhone'", EditText.class);
    target.etEmail = Utils.findRequiredViewAsType(source, R.id.edit_email, "field 'etEmail'", EditText.class);
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.edit_user_name, "field 'etUserName'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.edit_password, "field 'etPassword'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EditProfileActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etNameAr = null;
    target.etNameEn = null;
    target.etAddress = null;
    target.etPhone = null;
    target.etEmail = null;
    target.etUserName = null;
    target.etPassword = null;
  }
}

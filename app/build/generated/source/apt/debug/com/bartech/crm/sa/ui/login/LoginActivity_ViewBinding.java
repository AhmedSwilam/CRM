// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131558578;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_login_screen, "field 'btnLogin' and method 'onServerLoginClicked'");
    target.btnLogin = Utils.castView(view, R.id.btn_login_screen, "field 'btnLogin'", Button.class);
    view2131558578 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServerLoginClicked(p0);
      }
    });
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.et_Email, "field 'etUserName'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password_login, "field 'etPassword'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnLogin = null;
    target.etUserName = null;
    target.etPassword = null;

    view2131558578.setOnClickListener(null);
    view2131558578 = null;
  }
}

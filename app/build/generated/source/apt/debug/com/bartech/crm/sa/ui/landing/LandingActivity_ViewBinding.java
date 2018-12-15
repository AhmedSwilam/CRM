// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.landing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LandingActivity_ViewBinding implements Unbinder {
  private LandingActivity target;

  private View view2131558574;

  private View view2131558575;

  @UiThread
  public LandingActivity_ViewBinding(LandingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LandingActivity_ViewBinding(final LandingActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_login, "field 'btnLogin' and method 'openloginActivity'");
    target.btnLogin = Utils.castView(view, R.id.btn_login, "field 'btnLogin'", Button.class);
    view2131558574 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openloginActivity();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_register, "field 'btnRegister' and method 'openRegisterActivity'");
    target.btnRegister = Utils.castView(view, R.id.btn_register, "field 'btnRegister'", Button.class);
    view2131558575 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openRegisterActivity();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LandingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnLogin = null;
    target.btnRegister = null;

    view2131558574.setOnClickListener(null);
    view2131558574 = null;
    view2131558575.setOnClickListener(null);
    view2131558575 = null;
  }
}

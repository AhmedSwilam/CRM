// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.about;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutFragment_ViewBinding implements Unbinder {
  private AboutFragment target;

  private View view2131558665;

  @UiThread
  public AboutFragment_ViewBinding(final AboutFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.nav_back_btn, "method 'onNavBackClick'");
    view2131558665 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNavBackClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558665.setOnClickListener(null);
    view2131558665 = null;
  }
}

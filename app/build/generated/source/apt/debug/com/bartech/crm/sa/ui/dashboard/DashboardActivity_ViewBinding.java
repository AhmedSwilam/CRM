// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.dashboard;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DashboardActivity_ViewBinding implements Unbinder {
  private DashboardActivity target;

  @UiThread
  public DashboardActivity_ViewBinding(DashboardActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DashboardActivity_ViewBinding(DashboardActivity target, View source) {
    this.target = target;

    target.txtClientName = Utils.findRequiredViewAsType(source, R.id.txt_client_name, "field 'txtClientName'", TextView.class);
    target.txtClientType = Utils.findRequiredViewAsType(source, R.id.txt_client_type, "field 'txtClientType'", TextView.class);
    target.txtVisitCount = Utils.findRequiredViewAsType(source, R.id.txt_visits_count, "field 'txtVisitCount'", TextView.class);
    target.txtComplaintCount = Utils.findRequiredViewAsType(source, R.id.txt_complaint_count, "field 'txtComplaintCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DashboardActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtClientName = null;
    target.txtClientType = null;
    target.txtVisitCount = null;
    target.txtComplaintCount = null;
  }
}

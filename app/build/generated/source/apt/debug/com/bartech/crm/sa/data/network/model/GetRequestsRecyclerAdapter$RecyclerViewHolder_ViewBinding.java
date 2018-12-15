// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.data.network.model;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GetRequestsRecyclerAdapter$RecyclerViewHolder_ViewBinding implements Unbinder {
  private GetRequestsRecyclerAdapter.RecyclerViewHolder target;

  @UiThread
  public GetRequestsRecyclerAdapter$RecyclerViewHolder_ViewBinding(GetRequestsRecyclerAdapter.RecyclerViewHolder target, View source) {
    this.target = target;

    target.txtComplaintNumber = Utils.findRequiredViewAsType(source, R.id.txt_complaint_number, "field 'txtComplaintNumber'", TextView.class);
    target.txtComplaintDate = Utils.findRequiredViewAsType(source, R.id.txt_complaint_date, "field 'txtComplaintDate'", TextView.class);
    target.txtDeviceName = Utils.findRequiredViewAsType(source, R.id.txt_device_name, "field 'txtDeviceName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GetRequestsRecyclerAdapter.RecyclerViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtComplaintNumber = null;
    target.txtComplaintDate = null;
    target.txtDeviceName = null;
  }
}

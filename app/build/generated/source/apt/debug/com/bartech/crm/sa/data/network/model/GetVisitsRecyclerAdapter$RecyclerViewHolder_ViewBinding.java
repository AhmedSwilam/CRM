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

public class GetVisitsRecyclerAdapter$RecyclerViewHolder_ViewBinding implements Unbinder {
  private GetVisitsRecyclerAdapter.RecyclerViewHolder target;

  @UiThread
  public GetVisitsRecyclerAdapter$RecyclerViewHolder_ViewBinding(GetVisitsRecyclerAdapter.RecyclerViewHolder target, View source) {
    this.target = target;

    target.txtComplaintNumber = Utils.findRequiredViewAsType(source, R.id.txt_complaint_number, "field 'txtComplaintNumber'", TextView.class);
    target.txtDeviceDate = Utils.findRequiredViewAsType(source, R.id.txt_device_date, "field 'txtDeviceDate'", TextView.class);
    target.txtTechnicianName = Utils.findRequiredViewAsType(source, R.id.txt_technician_name, "field 'txtTechnicianName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GetVisitsRecyclerAdapter.RecyclerViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtComplaintNumber = null;
    target.txtDeviceDate = null;
    target.txtTechnicianName = null;
  }
}

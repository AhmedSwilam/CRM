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

public class GetDevicesRecyclerAdapter$RecyclerViewHolder_ViewBinding implements Unbinder {
  private GetDevicesRecyclerAdapter.RecyclerViewHolder target;

  @UiThread
  public GetDevicesRecyclerAdapter$RecyclerViewHolder_ViewBinding(GetDevicesRecyclerAdapter.RecyclerViewHolder target, View source) {
    this.target = target;

    target.txtDeviceName = Utils.findRequiredViewAsType(source, R.id.txt_device_name, "field 'txtDeviceName'", TextView.class);
    target.txtDeviceDate = Utils.findRequiredViewAsType(source, R.id.txt_device_date, "field 'txtDeviceDate'", TextView.class);
    target.txtCategoryName = Utils.findRequiredViewAsType(source, R.id.txt_category_name, "field 'txtCategoryName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GetDevicesRecyclerAdapter.RecyclerViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtDeviceName = null;
    target.txtDeviceDate = null;
    target.txtCategoryName = null;
  }
}

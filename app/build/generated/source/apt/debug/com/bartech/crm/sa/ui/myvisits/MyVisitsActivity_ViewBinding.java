// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.myvisits;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyVisitsActivity_ViewBinding implements Unbinder {
  private MyVisitsActivity target;

  @UiThread
  public MyVisitsActivity_ViewBinding(MyVisitsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyVisitsActivity_ViewBinding(MyVisitsActivity target, View source) {
    this.target = target;

    target.getRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_get_visits, "field 'getRecyclerView'", RecyclerView.class);
    target.txtNoVisitData = Utils.findRequiredViewAsType(source, R.id.txt_no_visits_data, "field 'txtNoVisitData'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyVisitsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.getRecyclerView = null;
    target.txtNoVisitData = null;
  }
}

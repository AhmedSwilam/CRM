// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.mydevices;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyDevicesActivity_ViewBinding implements Unbinder {
  private MyDevicesActivity target;

  @UiThread
  public MyDevicesActivity_ViewBinding(MyDevicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyDevicesActivity_ViewBinding(MyDevicesActivity target, View source) {
    this.target = target;

    target.getRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_get_requests, "field 'getRecyclerView'", RecyclerView.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDrawer = Utils.findRequiredViewAsType(source, R.id.drawerlayout, "field 'mDrawer'", DrawerLayout.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'mNavigationView'", NavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyDevicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.getRecyclerView = null;
    target.mToolbar = null;
    target.mDrawer = null;
    target.mNavigationView = null;
  }
}

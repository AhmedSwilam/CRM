// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.allcomplaint;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyComplaintsActivity_ViewBinding implements Unbinder {
  private MyComplaintsActivity target;

  private View view2131558566;

  @UiThread
  public MyComplaintsActivity_ViewBinding(MyComplaintsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyComplaintsActivity_ViewBinding(final MyComplaintsActivity target, View source) {
    this.target = target;

    View view;
    target.getRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_get_requests, "field 'getRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.img_add_new_request, "field 'imgAddNewRequest' and method 'onAddButtonClicked'");
    target.imgAddNewRequest = Utils.castView(view, R.id.img_add_new_request, "field 'imgAddNewRequest'", ImageView.class);
    view2131558566 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAddButtonClicked();
      }
    });
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mDrawer = Utils.findRequiredViewAsType(source, R.id.drawerlayout, "field 'mDrawer'", DrawerLayout.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'mNavigationView'", NavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyComplaintsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.getRecyclerView = null;
    target.imgAddNewRequest = null;
    target.mToolbar = null;
    target.mDrawer = null;
    target.mNavigationView = null;

    view2131558566.setOnClickListener(null);
    view2131558566 = null;
  }
}

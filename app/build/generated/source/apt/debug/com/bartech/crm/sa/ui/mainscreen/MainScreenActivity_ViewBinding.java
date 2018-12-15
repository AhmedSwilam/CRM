// Generated code from Butter Knife. Do not modify!
package com.bartech.crm.sa.ui.mainscreen;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.crm.sa.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainScreenActivity_ViewBinding implements Unbinder {
  private MainScreenActivity target;

  @UiThread
  public MainScreenActivity_ViewBinding(MainScreenActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainScreenActivity_ViewBinding(MainScreenActivity target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'mNavigationView'", NavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainScreenActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.mNavigationView = null;
  }
}

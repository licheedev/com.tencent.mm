package android.support.v7.internal.view.menu;

import android.support.v4.view.d;
import android.support.v4.view.d.b;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class j
  extends i
{
  j(MenuItem paramMenuItem)
  {
    super(paramMenuItem, false);
  }
  
  final i.a b(d paramd)
  {
    return new a(paramd);
  }
  
  final class a
    extends i.a
    implements d.b
  {
    ActionProvider.VisibilityListener mU;
    
    public a(d paramd)
    {
      super(paramd);
    }
    
    public final boolean isVisible()
    {
      return true;
    }
    
    public final View onCreateActionView(MenuItem paramMenuItem)
    {
      return mP.onCreateActionView();
    }
    
    public final boolean overridesItemVisibility()
    {
      return false;
    }
    
    public final void refreshVisibility() {}
    
    public final void setVisibilityListener(ActionProvider.VisibilityListener paramVisibilityListener)
    {
      mU = paramVisibilityListener;
      d locald = mP;
      if (paramVisibilityListener != null) {}
      for (paramVisibilityListener = this;; paramVisibilityListener = null)
      {
        locald.a(paramVisibilityListener);
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.mayancoders.idia.ui;

import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class UiDragListener implements OnDragListener{

	@Override
	public boolean onDrag(View v, DragEvent event) {
		switch (event.getAction()) {
	    case DragEvent.ACTION_DRAG_STARTED:
	    // Do nothing
	      break;
	    case DragEvent.ACTION_DRAG_ENTERED:
	      //v.setBackgroundDrawable(enterShape);
	      break;
	    case DragEvent.ACTION_DRAG_EXITED:        
	      //v.setBackgroundDrawable(normalShape);
	      break;
	    case DragEvent.ACTION_DROP:
			try {
				// Dropped, reassign View to ViewGroup
				  View view = (View) event.getLocalState();
				  ViewGroup owner = (ViewGroup) view.getParent();
				  owner.removeView(view);
				  LinearLayout container = (LinearLayout) v;
				  container.addView(view);
				  view.setVisibility(View.VISIBLE);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      break;
	    case DragEvent.ACTION_DRAG_ENDED:
	      //v.setBackgroundDrawable(normalShape);
	      default:
	      break;
	    }
	    return true;
	}

}

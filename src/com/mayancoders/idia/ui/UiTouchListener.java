package com.mayancoders.idia.ui;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnTouchListener;

public class UiTouchListener implements OnTouchListener {

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		try{
			if(event.getAction() == MotionEvent.ACTION_DOWN){
				ClipData clipData = ClipData.newPlainText("","");
				DragShadowBuilder dragShadowBuilder = new View.DragShadowBuilder(v);
				v.startDrag(clipData, dragShadowBuilder, v, 0);
				return true;
			}else{
				return false;
			}
		}catch (Exception e) {
			return false;
		}
	}

}

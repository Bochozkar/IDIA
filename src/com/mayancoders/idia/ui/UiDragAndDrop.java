package com.mayancoders.idia.ui;

import android.view.View;

public class UiDragAndDrop {

	public void addDragAndDropToView(View v){
		v.setOnTouchListener(new UiTouchListener());
	}
	
	public void addDropListenerToView(View v){
		v.setOnDragListener(new UiDragListener());
	}
	
}

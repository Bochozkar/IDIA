package com.mayancoders.idia.ui;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.LinearLayout;

public class UiStateListener implements OnAttachStateChangeListener {

	private Ui ui = new Ui();
	private Context context = null;
	private List<String[]> resourceList = null;
	private LinearLayout ly = null;

	public UiStateListener(Context context, List<String[]> resourceList) {
		super();
		this.context = context;
		this.resourceList = resourceList;
	}
	
	@Override
	public void onViewAttachedToWindow(View v) {
		ly = (LinearLayout) v;
		ui.addToolToLayout(ly, ui.createListViews(context, ly, resourceList));
		ui.setTouchListenerToLayoutChilds(ly);
	}

	@Override
	public void onViewDetachedFromWindow(View v) {
		ly.removeAllViews();
	}

}

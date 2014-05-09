package com.mayancoders.idia.ui;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TabHost;

public class UiWorkspace {

	public UiWorkspace() {

	}

	/**
	 * @param bt
	 * @param sv
	 * @param lv
	 */
	public void addPanel(Button bt, final ScrollView sv, final View lv) {
		try {

			OnClickListener btListener = new OnClickListener() {

				@Override
				public void onClick(View v) {
					sv.removeAllViews();
					sv.addView(lv);
				}
			};
			bt.setOnClickListener(btListener);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addTab(Context context, TabHost th, String tag, String label,
			int id, int resource) {
		try {
			LayoutInflater inflater = LayoutInflater.from(context);
			inflater.inflate(resource, th.getTabContentView(), true);
			th.addTab(th.newTabSpec(tag).setIndicator(label).setContent(id));
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}

	public void addToolsToLayout(LinearLayout ly, List<View> views) {
		for (View v : views) {
			try {
				ly.addView(v);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

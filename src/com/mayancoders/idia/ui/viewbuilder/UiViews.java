package com.mayancoders.idia.ui.viewbuilder;

import java.util.ArrayList;
import java.util.List;

import com.mayancoders.idia.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class UiViews {

	private UiViewBuilder viewBuilder = new UiViewBuilder();

	/**
	 * @return ViewBulder
	 */
	public UiViewBuilder getViewBulder() {
		return viewBuilder;
	}

	/**
	 * @param context
	 * @param resource
	 * @return View
	 */
	public View createView(Context context, ViewGroup vg, int resource) {
		return getViewBulder().CreateView(context, vg, resource);
	}

	/**
	 * @param sv
	 * @param v
	 */
	public void AttachToScrollView(ScrollView sv, View v) {
		sv.addView(v);
	}

	public LinearLayout createLinearLayout(Context context, int[] resourceList) {
		return getViewBulder().createLinearLayout(context, resourceList);
	}

	public List<View> createViewsList(Context context, ViewGroup vg,
			List<String[]> resourceList) {
		List<View> views = new ArrayList<View>();
		for (String[] resource : resourceList) {
			try {
				View v = getViewBulder().CreateView(context, vg,
						(int)Integer.parseInt(resource[0]));
				TextView tvt = (TextView)v.findViewById(R.id.textViewBlockType);
				TextView tvn = (TextView)v.findViewById(R.id.textViewBlockName);
				tvt.setText(resource[1]);
				tvn.setText(resource[2]);
				views.add(v);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return views;
	}

}

package com.mayancoders.idia.ui.viewbuilder;

import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

public class UiViewBuilder {

	/**
	 * @param context
	 * @param resource
	 * @return View
	 */
	public View CreateView(Context context, ViewGroup vg, int resource) {
		try {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			return inflater.inflate(resource, vg, false);
		} catch (InflateException e) {
			return null;
		}catch (Exception e) {
			return null;
		}
	}
	
	public LinearLayout createLinearLayout(Context context, int[] resourceList){
		try{
			LinearLayout ly = new LinearLayout(context);
			ly.setOrientation(LinearLayout.VERTICAL);
			ly.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			for (Integer resource : resourceList) {
				ly.addView(CreateView(context, ly, resource));
			}
			return ly;
		}catch (Exception e) {
			return null;
		}
	}

}

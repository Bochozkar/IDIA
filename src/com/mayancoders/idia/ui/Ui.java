package com.mayancoders.idia.ui;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TabHost;

import com.mayancoders.idia.ui.viewbuilder.UiViews;

public class Ui {

	private UiWorkspace uiWorkspace = new UiWorkspace();
	private UiViews uiViews = new UiViews();
	private UiDragAndDrop uiDragAndDrop = new UiDragAndDrop();
	
	private UiWorkspace getUiWorkspace(){
		return uiWorkspace;
	}
	
	private UiViews getUiViews(){
		return uiViews;
	}
	
	private UiDragAndDrop getUiDragAndDrop(){
		return uiDragAndDrop;
	}
	
	public void changePanel(Button bt, ScrollView sv, Context context, int resource, List<String[]> resourceList){
		View v = uiViews.createView(context, sv, resource);
		v.addOnAttachStateChangeListener(new UiStateListener(context,resourceList));
		getUiWorkspace().addPanel(bt, sv, v);
	}
	
	public void changePanel(Button bt, ScrollView sv, Context context, int[] resourceList){
		getUiWorkspace().addPanel(bt, sv, uiViews.createLinearLayout(context, resourceList));
	}
	
	public void addTabToTabHost(Context context, TabHost th, String tag, String label, int id, int resource){
		getUiWorkspace().addTab(context, th, tag, label, id, resource);
	}
	
	public void createLinearLayout(Context context, int[] resourceList){
		getUiViews().createLinearLayout(context, resourceList);
	}
	
	public void setTouchListenerToLayoutChilds(LinearLayout ly){
		for(int x = 0; x<ly.getChildCount(); x++){
			getUiDragAndDrop().addDragAndDropToView(ly.getChildAt(x));
			getUiDragAndDrop().addDropListenerToView(ly.getChildAt(x));
		}
	}
	
	public void setDragListenerToView(View v){
		getUiDragAndDrop().addDropListenerToView(v);
	}
	
	public void addToolToLayout(LinearLayout ly, List<View> views){
		getUiWorkspace().addToolsToLayout(ly, views);
	}
	
	public List<View> createListViews(Context context, ViewGroup vg, List<String[]> resourceList){
		return getUiViews().createViewsList(context, vg, resourceList);
	}
	
}

package com.mayancoders.idia;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TabHost;

import com.mayancoders.idia.ui.Ui;

public class MainActivity extends SherlockActivity {

	// Instanciando objetos
	private Ui ui = new Ui();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ActionBar

		// --------
		// Botones
		Button btnCicles = (Button) findViewById(R.id.buttonCiclesMenu);
		Button btnConditional = (Button) findViewById(R.id.buttonConditinalsMenu);
		Button btnConnections = (Button) findViewById(R.id.buttonConnectionsMenu);

		// ScrollView
		ScrollView svCicles = (ScrollView) findViewById(R.id.verticalScrollViewWorkingAreaLeft);

		// TabHost
		TabHost thBlocks = (TabHost) findViewById(R.id.tabhostWorkspace);
		thBlocks.setup();

		// Areglo de herramientas
		List<String[]> resourceList = new ArrayList<String[]>();
		// int[] resourceList = new int[2];
		String[] h1 = { String.valueOf(R.layout.rectangle_layout), "Ciclo",
				"For" };
		String[] h2 = { String.valueOf(R.layout.rectangle_layout), "Ciclo",
				"While" };
		resourceList.add(h1);
		resourceList.add(h2);
		// resourceList[0] = R.layout.rectangle_layout;
		// resourceList[1] = R.layout.rectangle_layout;

		// Comportamiento
		ui.changePanel(btnCicles, svCicles, getApplicationContext(),
				R.layout.cicles_layout, resourceList);
		ui.changePanel(btnConditional, svCicles, getApplicationContext(),
				R.layout.conditional_layout, resourceList);
		ui.changePanel(btnConnections, svCicles, getApplicationContext(),
				R.layout.connections_layout, resourceList);

		// Agregando Tabs a TabHost
		ui.addTabToTabHost(getApplicationContext(), thBlocks, "blocks",
				"Bloques", R.id.blocks_layout, R.layout.blocks_layout);
		ui.addTabToTabHost(getApplicationContext(), thBlocks, "code", "Codigo",
				R.id.code_layout, R.layout.code_layout);

		// Agregando DragListener al contenerdor;
		LinearLayout ly = (LinearLayout) findViewById(R.id.blocks_layout);
		ui.setDragListenerToView(ly);
	}

}

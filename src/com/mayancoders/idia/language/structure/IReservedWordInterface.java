package com.mayancoders.idia.language.structure;

import android.view.View;

public interface IReservedWordInterface {

	public String getDefinition();

	public void setDefinition(String definition);

	public void setId(int id);

	public int getId();

	public void addBlock(Object rw);

	public Object getBlock();
	
	public View getView();

	public void setView(View v);
	
}

package com.mayancoders.idia.language.structure;

import android.view.View;

public class ReservedWordStructure implements IReservedWordInterface {

	private ReservedWordStructure rw;
	private String definition;
	private int id;
	private View v;

	public ReservedWordStructure(String definition, int id) {
		this.definition = definition;
		this.id = 0;
		this.rw = null;
	}

	@Override
	public String getDefinition() {
		return this.definition;
	}

	@Override
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void addBlock(Object rw) {
		this.rw = (ReservedWordStructure) rw;
	}

	@Override
	public ReservedWordStructure getBlock(){
		return this.rw;
	}
	
	@Override
	public View getView() {
		return v;
	}

	@Override
	public void setView(View v) {
		this.v = v;
	}

}

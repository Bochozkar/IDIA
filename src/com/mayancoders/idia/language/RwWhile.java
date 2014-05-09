package com.mayancoders.idia.language;

import com.mayancoders.idia.language.structure.ReservedWordStructure;

public class RwWhile extends ReservedWordStructure {

	public static final String rwName = "while";

	public RwWhile(String definition, int id) {
		super(definition, id);
	}
	
	public String getBlocksString(){
		if(getBlock() != null){
			return getDefinition() + getBlock().getDefinition();
		}else
		{
			return getDefinition();
		}
	}

}

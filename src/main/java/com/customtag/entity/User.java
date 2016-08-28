package com.customtag.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<String> rights;
	
	public void setRight(String right) {
		if(this.rights==null){
			this.rights=new ArrayList<>();
		}
		this.rights.add(right);
	}

	public boolean hasRight(String right) {
		return this.rights.contains(right);
	}

}

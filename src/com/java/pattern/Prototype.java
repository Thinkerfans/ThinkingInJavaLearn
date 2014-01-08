package com.java.pattern;

public class Prototype implements Cloneable {


	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	String label;
	public void setLabel(String l){
		label = l;
	}


}

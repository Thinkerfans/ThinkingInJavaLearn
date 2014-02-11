package com.java.chapter5;


public class ThisUseTest {

	public ThisUseTest() {
		// TODO Auto-generated constructor stub
		
		this(1);
//		this(1,"tag");//error: Constructor call must be the first statement in a constructor
		
	
	}
	
	public ThisUseTest(int i) {
		// TODO Auto-generated constructor stub
		this(1,"a");
		
	}
	
	public ThisUseTest(int i,String s) {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

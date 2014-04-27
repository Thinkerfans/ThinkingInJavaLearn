package com.java.chapter9;

public class MyInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

interface A{
	public static final int a = 0;
	void a();
}

interface B{	
	void b();
}

interface C{
	void c();
}

class D{
	D(){
		int a = A.a;
	}
}

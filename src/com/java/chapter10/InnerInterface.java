package com.java.chapter10;

import javax.swing.text.AbstractDocument.Content;

import com.java.chapter10.Parcel1.Contents;
import com.java.chapter10.Parcel1.Destination;

public class InnerInterface {

	interface A{
		 int a = 0;			
		 class B{}
		class C{}
		interface D{};
		interface E{};
	}
	
	class B{
		int a = A.a;
		class C{};
		
	}
	
	void test(){
		Parcel1 p = new Parcel1();
		Contents c = p.new Contents();
		c.value();
		Destination d = p.new Destination("test2");

		System.out.println(d.readLabel());
		
	}

	
	
	
}

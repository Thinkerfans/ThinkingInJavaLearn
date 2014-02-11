package com.java.chapter5;

import com.thinker.log.Mylog;

public class InitOrderTest {
	
	static Myobject o1 = new Myobject("static obj inti");
	Myobject o2 = new Myobject("normal obj init ");
	
	static Myobject o3;
	static{
		 o3 = new Myobject("static obj init in braces ");
	}
	Myobject o4;
	{
		o4 = new Myobject("normal obj init in braces  ");
	}
	
	public InitOrderTest() {
		// TODO Auto-generated constructor stub
		Mylog.p("InitOrderTest construct");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new InitOrderTest();
	}		
}

class Myobject{
	
	String tag;	
	public Myobject(String tag) {
		super();
		this.tag = tag;
		Mylog.p(tag);
	}
			
}


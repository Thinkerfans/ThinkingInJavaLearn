package com.java.chapter8;

import static com.thinker.log.Mylog.*;

public class Cycle {

	String tag = "two wheel";
	

	void ride() {
		p("Cycle ride()");
		p(wheels());
	}
	
	int wheels(){
		return 2;
	}
	
	private void printTag(){
		p(tag);
	}

	static void print(){
		p("static method print in Cycle");
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle[] c = { new UniCycle(), new Cycle(), new TriCycle() };
		for (Cycle c1 : c) {
			c1.ride();
			c1.printTag();
			p(c1.tag);
			c1.print();// 只有普通方法的调用可以是多态的。
		}
	}
}

class UniCycle extends Cycle {
	String tag = "one wheel";

	@Override
	public void ride() {
		p("UniCycle ride()");
		p(wheels());
	}
	
	int wheels(){
		return 1;
	}
	
	
	public void printTag(){
		p(tag);
	}
	
	static void print(){
		p("static method print in UniCycle");
	};
}

class TriCycle extends Cycle {
	String tag = "three wheel";

	public void ride() {
		p("TriCycle ride()");
		p(wheels());
	}
	int wheels(){
		return 3;
	}
	
	public void printTag(){
		p(tag);
	}
	
	static void print(){
		p("static method print in TriCycle");
	};
}

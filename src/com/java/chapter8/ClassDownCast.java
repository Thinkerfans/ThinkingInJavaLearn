package com.java.chapter8;

public class ClassDownCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[] u = { new MoreUseful(), new Useful() };

		for (Useful u1 : u) {
			u1.f();
			((MoreUseful) u1).u();

		}
	}

}

class Useful {
	public void f() {
	}

	public void g() {
	}

}

class MoreUseful extends Useful {
	public void f() {
	}

	public void g() {
	}

	public void u() {
	};
}

package com.java.chapter10;

public class Parcel1 {

	class Contents {
		private int i = 1;

		public int value() {
			return i;
		}

		public Contents() {
		}
	}

	class Destination {
		private String label;

		public Destination(String s) {
			this.label = s;
		}

		public String readLabel() {
			return label;
		}
	}

	public void userInnerClass() {
		Contents c = new Contents();
		Destination d = new Destination("test");
		System.out.println(d.label);
		System.out.println(d.readLabel());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel1 p = new Parcel1();
		p.userInnerClass();

		Contents c = p.new Contents();
		Destination d = p.new Destination("test2");
		System.out.println(d.label);
		System.out.println(d.readLabel());
	}

}

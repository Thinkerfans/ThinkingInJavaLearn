package chapter.inner.classes;

import java.util.ArrayList;
import java.util.List;

public class InnerClassCreate {

	/**
	 * Normal Inner class
	 **/
	class NormalInnerClass {
		public NormalInnerClass() {
			System.out.println("normal innner class------" + this);
		}
	}

	/**
	 * static Inner class
	 **/
	static class staticInnerClass {
		public staticInnerClass() {
			System.out.println("static innner class------" + this);
		}
	}

	/**
	 * aninymout Inner class
	 **/
	interface InterfaceInClass {
		void printClassName();
	}

	private InterfaceInClass AnonymousInnerClass = new InterfaceInClass() {

		{
			System.out.println("anonymous innner class------" + this);
		}


		public void printClassName() {
			System.out.println(this.getClass().getName());
		}
	};

	/**
	 * local Inner class
	 **/
	public InterfaceInClass getLocalInnerClass(String tag) {

		class LocalInnerClass implements InterfaceInClass {

			public LocalInnerClass() {
				System.out.println("local innner class------" + this);
			}

			String tag;

			public LocalInnerClass(String tag) {
				System.out.println("local innner class------" + this);
			}

		
			public void printClassName() {
				System.out.println(tag + "---------------\n"
						+ this.getClass().getName());
			}
		}
		return new LocalInnerClass(tag);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NormalInnerClass normalCs = new InnerClassCreate().new NormalInnerClass();
		staticInnerClass staticCs = new staticInnerClass();
		InterfaceInClass localCs = new InnerClassCreate()
				.getLocalInnerClass("local inner class");

	}

}

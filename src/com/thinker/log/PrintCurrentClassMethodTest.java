package com.thinker.log;

public class PrintCurrentClassMethodTest {	
	 
	public  static void main(String[] arg){	
		
		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		ClassAndMethod  test = new ClassAndMethod();
		test.printClassNameTest();
		test.printMethodNameTest();
	}
		
}

class ClassAndMethod{
	
	/*
	 * also by new subclass of class Throwable. for example new Exception.getStrackTrace()[0].getClassName();
	 * tip:the index like zero or one is not sonstant ,it change by java jdk version
	 * */
	 void printClassNameTest(){	
		System.out.println(new Throwable().getStackTrace()[0].getClassName());
		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

	}
	 	
	 void printMethodNameTest(){	 
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		printMethodNameTest1();
	}	
	 
	 void printMethodNameTest1(){		 
			System.out.println(new Throwable().getStackTrace()[0].getMethodName());		
			System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		}	
}

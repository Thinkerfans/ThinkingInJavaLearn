package com.java.chapter5;

import com.thinker.log.Mylog;

// char type  
public class OverLoadTest {
	
	void f1(byte b){Mylog.p("f1() byte");}
	void f1(char b){Mylog.p("f1() char");}
	void f1(short b){Mylog.p("f1() short");}
	void f1(int b){Mylog.p("f1() int");}
	void f1(long b){Mylog.p("f1() long");}
	void f1(float b){Mylog.p("f1() float");}
	void f1(double b){Mylog.p("f1() double");}
	
	void f2(char b){Mylog.p("f2() char");}
	void f2(short b){Mylog.p("f2() short");}
	void f2(int b){Mylog.p("f2() int");}
	void f2(long b){Mylog.p("f2() long");}
	void f2(float b){Mylog.p("f2() float");}
	void f2(double b){Mylog.p("f2() double");}	

	void f3(short b){Mylog.p("f3() short");}
	void f3(int b){Mylog.p("f3() int");}
	void f3(long b){Mylog.p("f3() long");}
	void f3(float b){Mylog.p("f3() float");}
	void f3(double b){Mylog.p("f3() double");}
	
	void f4(int b){Mylog.p("f4() int");}
	void f4(long b){Mylog.p("f4() long");}
	void f4(float b){Mylog.p("f4() float");}
	void f4(double b){Mylog.p("f4() double");}

	

	void f5(long b){Mylog.p("f5() long");}
	void f5(float b){Mylog.p("f5() float");}
	void f5(double b){Mylog.p("f5() double");}
	

	void f6(float b){Mylog.p("f6() float");}
	void f6(double b){Mylog.p("f6() double");}
	
	
	void f7(double b){Mylog.p("f7() double");}
	
	void testByte(){
		byte i = 1;
		f1(i);f2(i);f3(i);f4(i);f5(i);f6(i);f7(i);		
	}
	
	void testChar(){
		char i = '1';
		f1(i);f2(i);f3(i);f4(i);f5(i);f6(i);f7(i);		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadTest test = new OverLoadTest();
//		test.testByte();
		test.testChar();
	}


}

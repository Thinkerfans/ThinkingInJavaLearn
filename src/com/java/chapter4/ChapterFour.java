package com.java.chapter4;

import java.util.Random;

import com.thinker.log.Mylog;

public class ChapterFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChapterFour four = new ChapterFour();
		// four.pratice_1();
		// four.pratice_2();
//		four.pratice_3(100);
		four.labelTest();
		

	}

	private void labelTest() {
		int count = 0;
		Mylog.p("befor while loop");
		labelOne:
		while(true){		
			Mylog.p("befor for loop");
			labelTwo:
			for(int i = 0;i<5;i++){	
				
				if(i==5)
					break labelTwo;
				
				count++;
				if(count==3)
					break labelOne;
			}
			
			
			
			Mylog.p("after for loop");
		}
		
		
	}

	void pratice_1() {
		Random rand = new Random();
		// Math.random();// 实际上调用的是rand.nextDouble();
		for (int i = 0; i < 25; i++) {
			Mylog.p(rand.nextInt(100));
		}
	}

	void pratice_2() {
		int num = 0;
		for (int i = 0; i < 100; i++)
			if (isPrime(i)) {
				Mylog.p(i);
				num++;
			}
		Mylog.p("range 1-100 the prime numbers are " + num);
	}

	void pratice_3(int n) {
		String s1 = Integer.toBinaryString(n);
		String s = toBinaryString(n);

		Mylog.p("the num binary form is " + s1);
		Mylog.p("the num binary form is " + s);

	}

	String toBinaryString(int n) {
		StringBuffer s = new StringBuffer();
		do {
			if (n % 2 == 0)
				s.append(0);
			else
				s.append(1);

			n = n / 2;
		} while (n != 0);
		return s.reverse().toString();
	}

	boolean isPrime(int n) {
		if (n < 2)
			return false;
		else
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		return true;
	}
}

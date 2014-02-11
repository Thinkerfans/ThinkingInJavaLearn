package com.java.chapter5;

import com.thinker.log.Mylog;

public class DefaultInitialValue {
	
	char c ;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	Character oc;
	Byte ob;
	Short os;
	Integer oi;
	Long ol;
	Float of;
	Double od;

	String str;
	
	

	@Override
	public String toString() {
		return "DefaultInitialValue [c=" + c + ", b=" + b + ", s=" + s + ", i="
				+ i + ", l=" + l + ", f=" + f + ", d=" + d + ", oc=" + oc
				+ ", ob=" + ob + ", os=" + os + ", oi=" + oi + ", ol=" + ol
				+ ", of=" + of + ", od=" + od + ", str=" + str + "]";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		DefaultInitialValue test = new DefaultInitialValue();
		Mylog.p(test);		
	}

}

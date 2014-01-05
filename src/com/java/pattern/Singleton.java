package com.java.pattern;

/**
 *  单例模式 singleton pattern
 *  就是一个类只能有一个实例存在。
 *  参考网址：wiki 单例模式
 *  
 * @author thinker
 *
 */

// Eager initialization ：饿汉模式 指全局的单例实例在类装载时构建。
public class Singleton {	
	public final static Singleton SINGLETON = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return SINGLETON;
	}
}

//Lazy initialization 懒汉模式 ：指全局的单例实例在第一次被使用时构建。
class Singleton2 {	
	public static Singleton2 singleton = null ;
	private Singleton2(){}
	public static synchronized Singleton2 getInstance(){		
		if(singleton == null)
			singleton = new Singleton2();
		
		return singleton;
	}
}
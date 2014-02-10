package com.thinker.log;


/**
 * 
 * 便于调试的类
 * 
 */
public class Mylog {
	private static boolean showLog = true;

	/**
	 * 是否显示日志
	 * 
	 * @param enable
	 */
	public static void enableLogging(boolean enable) {
		showLog = enable;
	}

	/**
	 * 一般信息
	 * 
	 * @param tag
	 * @param msg
	 */

	public static void p() {
		if (showLog)
			System.out.println();
	}

	public static void p(String str) {
		if (showLog)
			System.out.println(str);
	}

	public static void p(boolean b) {
		if (showLog)
			System.out.println(b);
	}

	public static void p(Object o) {
		if (showLog)
			System.out.println(o);
	}

	public static void p(int i) {
		if (showLog)
			System.out.println(i);
	}

	public static void p(long l) {
		if (showLog)
			System.out.println(l);
	}

	public static void p(float f) {
		if (showLog)
			System.out.println(f);
	}

	public static void p(double d) {
		if (showLog)
			System.out.println(d);
	}

	public static void p(char c) {
		if (showLog)
			System.out.println(c);
	}

	public static void p(char[] c) {
		if (showLog)
			System.out.println(c);
	}

//	public static void i(String tag, String msg) {
//		if (showLog)
//			Log.i(tag, msg);
//	}
//
//	/**
//	 * 错误信息
//	 * 
//	 * @param tag
//	 * @param msg
//	 */
//	public static void e(String tag, String msg) {
//		if (showLog)
//			Log.e(tag, msg);
//	}
//
//	/**
//	 * 错误信息
//	 * 
//	 * @param tag
//	 * @param msg
//	 * @param tr
//	 */
//	public static void e(String tag, String msg, Throwable tr) {
//		if (showLog)
//			Log.e(tag, msg, tr);
//	}
//
//	/**
//	 * 警告信息.
//	 * 
//	 * @param tag
//	 * @param msg
//	 */
//	public static void w(String tag, String msg) {
//		if (showLog)
//			Log.w(tag, msg);
//	}
//
//	/**
//	 * 警告信息.
//	 * 
//	 * @param tag
//	 * @param msg
//	 */
//	public static void w(String tag, String msg, Throwable tr) {
//		if (showLog)
//			Log.w(tag, msg, tr);
//	}
//
//	/**
//	 * debug信息.
//	 * 
//	 * @param tag
//	 * @param msg
//	 */
//	public static void d(String tag, String msg) {
//		if (showLog)
//			Log.d(tag, msg);
//	}
//
//	/**
//	 * 详细信息
//	 * 
//	 * @param tag
//	 * @param msg
//	 */
//	public static void v(String tag, String msg) {
//		if (showLog)
//			Log.v(tag, msg);
//	}
}

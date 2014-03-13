package com.java.arithmetic;

public class BinarySort {
	
	static int binarySort(int[] array, int value) {
		int low = 0, high = array.length - 1, middle = 0;
		while (low <= high) {
			middle = (low + high) / 2;
			if (value == array[middle])
				return middle;
			else if (value > array[middle])
				low = middle + 1;
			else
				high = middle - 1;
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 32, 34, 45, 45, 67, 78, 88, 98, 909 };
		int re = binarySort(a, 909);
		System.out.println(re);
		re = binarySort(a, 1011);
		System.out.println(re);
		re = binarySort(a, 0);
		System.out.println(re);

	}

}

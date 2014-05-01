package com.java.arithmetic;

public class OrderSearch {
	
	public static int sequenceSearch(int[] src,int target){		
		for(int i =0;i<src.length;i++)
			if(src[i]==target)
				return i;	
		return -1;
	}
	
	public static void main(String[] arg){
		
		int[] a = {2,34,56,6,78,0,45,45};
		System.out.println(sequenceSearch(a, 56));
		System.out.println(sequenceSearch(a, 45));
		System.out.println(sequenceSearch(a, 46));
	}
}

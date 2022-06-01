package com.syntax.class06;

public class EnhanceCode02 {

	public static void main(String[] args) {
		int a1=220;
		int a2=220;
		int a3=20;
		int largest =0;
		
		/*
		 * Compiler can initialize variables to it is default values
		 * int->0
		 * double->0.0
		 * boolean->false
		 * String->null
		 */
		
		if (a1>a2 && a1>a3) {
			largest=a1;
		}else if (a2>a1 && a2>a3) {
			largest=a2;
		}else if (a3>a1 && a3>a2) {
			largest=a3;
		}else {
			System.out.println("All numbers are equal");
			
		} 
		
		if (largest !=0)
		System.out.println("The largest is "+largest);
		

	}

}

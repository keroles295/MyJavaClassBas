package com.syntax.class14;

public class HW1402 {

	public static void main(String[] args) {
		HW1402 pito=new HW1402();
		pito.take(13, 24);

	}
	
	//Create a method that will take a number 
	//and prints whether the number is even or 
	//odd.
	void take(int i, int x) {
		if(i%2==0) {
			System.out.println(i+" is Even Number");
		}else {
			System.out.println(i+" is Odd Number");
		}
		 if(x%2==0) {
			System.out.println(x+" is Even Number");
		}else {
			System.out.println(x+" is Odd Number");
		}
	}
	
	
	

}

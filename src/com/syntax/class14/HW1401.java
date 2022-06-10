package com.syntax.class14;

public class HW1401 {

	public static void main(String[] args) {
		HW1401 pito=new HW1401();
		pito.larg(14, 25);
		
		

	}
	//Create a method that will take 2 
	//parameters as a numbers and prints which 
	//number is larger
	void larg(int i, int b) {
		if (i>b) {
			System.out.println(i+" is the largest number");
		}else {
			System.out.println(b+" is the largest number");
		}
	}
	
	

}

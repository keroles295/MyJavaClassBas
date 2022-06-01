package com.syntax.class04;

public class IFElseIf {

	public static void main(String[] args) {
		
		/*
		 * declare 2 numbers and verify which one is the largest
		 */
		int num1=40;
		int num2=60;
		
		if(num1>num2) {
			System.out.println(num1+" is the larger than "+num2);
			
		}else if (num2>num1) {
			System.out.println(num2+" is the larger than "+num1);
		}else {
			System.out.println(num1+" is equal to "+num2);
			
			
		}
		
		System.out.println("_____________");
		/*
		 * the moment java finds true condition->
		 * it executes that block and exist entire
		 * if statement
		 */
		
		int day=2;
		
		if (day==1) {
			System.out.println("Mon");
		}else if (day==2) {
			System.out.println("Tue");
		}else if (day==3) {
			System.out.println("Mon");
		}else if (day==4) {
			System.out.println("Th");
		}
		
	}

}

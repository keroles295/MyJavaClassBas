package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * declare a variable rate
		 * if rate is more than 5 --> I am not buying a house
		 */
		
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
			
			System.out.println("I am not buying a house");
		}
			int num1=99;
			int num2=10;
			
			if(num1>num2) {
				
				System.out.println(num1+" is bigger than "+num2);
				
			}
			
			/*
			 * declare temperature
			 * if tem is more 75 -> I will go walking
			 */
			
			int temp=75;
			if(temp>78) {
				System.out.println("I will go walking");
			}else { //otherwise. code comes to else
				    //when condition is false
				System.out.println("I will study Java");
			}
				
			System.out.println("---------------");	
			
			char gender='m';
			
			if (gender=='f') {
				System.out.println("You like shopping");
			}else {
				
				System.out.println("You like watiching sports");
			}
			
			System.out.println("------------------");
			
			String browser="chrome";
			
			if (browser.equals("chrome")) {
				
				System.out.println("All test cases will be executed on chrome");
			}else {
				
				System.out.println("I am not execute any test case");
				System.out.println("Reason - wrongbrowser");
			}
			
			
				
				
				
			
			
			
		

	}

}

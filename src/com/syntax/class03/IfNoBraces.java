package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		/*
		 * without braces java will 
		 */
	
		String time="Morning";
		
		if(time.equals("Morning")) {
			
			System.out.println("Say Good Morning");
		}else {
			
			System.out.println("Say Good Day");
			System.out.println("Or say good evening");
		}
			System.out.println("make sur to use {} with if statement");
		
	}

}

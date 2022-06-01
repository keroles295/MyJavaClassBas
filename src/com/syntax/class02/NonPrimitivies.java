package com.syntax.class02;

public class NonPrimitivies {

	public static void main(String[] args) {
		
		String name="Pietro";
		
		String lastName="Botros";
		
		long phone=1234567890l;
		
		//xxx-xxx-xxxx
		
		String phoneNumber="123-456-7890";
	
		String address="123 Washington str";
		int age =4;
		String age2 ="10";
	    String city="Miami";
	    city="Winchester";
		
		//shortcut for printing
		// type syso +ctrl +space --> hit enter
		
		/*
		 * we can use +
		 *             to attach String to String
		 *             to attach String to int
		 *             to attach String to double
		 *             to any other type
		 */
		
		System.out.println(name+" "+lastName); // Pietro Botros
		
		//Pietro lives in Miami
		
		System.out.println(name+" lives in "+city);
		
		//Pietro is 4 years old
		
		System.out.println(name+" is "+age+" years old "); 
		
	

	}

}

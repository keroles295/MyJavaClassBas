package com.syntax.class13;

public class HW1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String that should be combination of letters, numbers 
		//and special characters. 
		//Find out how many Alphanumeric characters are there in the String.
		
		String str="QWERTYUIasdfgh097654321~!@#$%^&*((SDFGHJK";
		
		System.out.println(str.replaceAll("[^A-Za-z]", "").length());
		
		
		
		
		
		
		
		
		

	}

}

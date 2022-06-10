package com.syntax.class13;

public class HW1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.You have a String a=”Is it saturday? Is it raining? 
		//Do we have a Java Class today?” 
		 
		//How would you find out how many sentences are in that String?
		
		
		String a=" Is it saturday? Is it raining? Do we have a Java Class today?";
		
		int count=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='?') {
				count++;
			}
		}
		System.out.println("There are "+count+" sentences in that String");
		
		System.out.println(a.split("[?]").length);
		
		
		
		
		
		

	}

}

package com.syntax.class13;

public class Recap1202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Where is Pietro?";
	   

		
		int counter=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
			if(counter==2) {	
			System.out.println(i+" ");
		}
		}
		}	
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("s"));//to search for the indexes number
		System.out.println(str.indexOf("e", 6));// in this case your search will start 6
		System.out.println(str.substring(0, 1));
		System.out.println(str.indexOf('e', 5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

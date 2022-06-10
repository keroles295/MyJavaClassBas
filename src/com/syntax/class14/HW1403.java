package com.syntax.class14;

public class HW1403 {

	public static void main(String[] args) {
		HW1403 pito=new HW1403();
		System.out.println(pito.isPlin("123456H654321"));
		

	}
	//Create a method that will print whether given String is palindrome or not.
	
	boolean isPlin(String orig) {
		String rev="";
		for(int i=orig.length()-1; i>=0; i--) {
			rev+=orig.charAt(i);
		}
		if(orig.equals(rev)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

	
		
		
	}



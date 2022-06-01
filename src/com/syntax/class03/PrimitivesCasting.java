package com.syntax.class03;

public class PrimitivesCasting {
	
	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		
		System.out.println(i);
	    System.out.println(d);
	    
		long l=10000;
		//byte b=140;
		// int x=100.99; // cannot convert from double to int
		int x=(int)99.99; // narrowing
		System.out.println(x);
		
		//byte b=130;
		byte b=(byte)130;
		System.out.println(b);
		//Type mismatch: cannot convert from double to float
		//float f=10.99;
		float f=10.99f;
		double dd=9.99;
		
		double price=100;
		
		
		
		
		
	}

}

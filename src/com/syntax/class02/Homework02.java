package com.syntax.class02;

public class Homework02 {
	public static void main(String[] args) {
		
	double mat=5.02;
	double nat=23.98;
	double sum, sub, mult, div;
	 sum=mat+nat;
	 sub=nat-mat;
	 mult=mat*nat;
	 div=nat/mat;
	
	System.out.println("The add of 2 numbers "+mat+" and "+nat+" is equal to "+sum);
	System.out.println("The subtract of 2 numbers "+nat+" and "+mat+" is equal to "+sub);
	System.out.println("The multiply of 2 numbers "+mat+" and "+nat+" is equal to "+mult);
	System.out.println("The divide of 2 numbers "+nat+" and "+mat+" is equal to "+div);
		
	System.out.println("____________________");

	
	double ab=3.9;
	double cd=ab;
	double sq=ab*cd;
	System.out.println("The square of the "+ab+" is "+sq);
	
	System.out.println("____________________");
	
	int wi=5;
	int he=8;
	int pe=2*(wi+he);
	int ar=wi*he;
	
	System.out.println("The perimeter of a rectangle with width "+wi+" and height "+he+" is equal to "+pe+" and the area is "+ar);
	
	}

}

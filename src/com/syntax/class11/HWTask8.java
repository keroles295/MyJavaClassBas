package com.syntax.class11;

public class HWTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to print the first 10 numbers of
		//Fibonacci series.
		// 0 1 1 2 3 5 8 13 21 
		int prevNum=0;
		int currentNum=1;
		int nextNum=0;
		int numtoPrint=10;
		System.out.println(0);
		System.out.println(1);
		for(int i=0; i<numtoPrint-2; i++) {
			nextNum=prevNum+currentNum;
			System.out.println(nextNum+" ");
			prevNum=currentNum;
			currentNum=nextNum;
		}


	}

}

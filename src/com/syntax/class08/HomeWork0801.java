package com.syntax.class08;

import java.util.Scanner;

public class HomeWork0801 {

	public static void main(String[] args) {
		
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		 int oN=0; int eN=0;  int x; int y;
		 Scanner scan=new Scanner(System.in);
			System.out.println("Enter start number");
			x=scan.nextInt();
			System.out.println("Enter end number");
			y=scan.nextInt();
		for(int i=x; x<=y; x++) {
			if (x%2==0) {
				eN+=x;
			}else {
				oN+=x;
			}
		}
		System.out.println("SumEveen is"+eN);
		System.out.println("SumOdd is "+oN);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.syntax.class08;

import java.util.Scanner;

public class Err {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cum=0; 
		String item; double price; double pay;
		Scanner scant=new Scanner (System.in);
		System.out.println("Which item do you want?");
        item=scant.next();
		System.out.println("Enter the price for that item");
		price=scant.nextDouble();
		do {
			System.out.println("Please enter your money");
			pay=scant.nextDouble();
			cum+=pay;
			System.out.println("Please enter "+(price-cum)+" $ to complete your transaction");
			
		if(pay>price) {
			System.out.println("This is your change"+(pay-price));
			}
			}while(price>cum);
		
		System.out.println("Thanks for shopping with us!");
		

	}

}

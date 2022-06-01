package com.syntax.class08;

import java.util.Scanner;

public class HW0802222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to ask a user to enter item they want to buy and the price of that item.
		//Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
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

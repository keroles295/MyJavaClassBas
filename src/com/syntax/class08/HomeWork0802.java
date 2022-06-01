package com.syntax.class08;

import java.util.Scanner;

public class HomeWork0802 {

	public static void main(String[] args) {
		//Write a program to ask a user to enter item they want to buy and the price of that item.
		// Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
		// If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		
		
		Scanner scan=new Scanner(System.in);
		double i=0; double change=0; double eX=0;
		System.out.println("Which item do you want?");
		String item=scan.next();
		System.out.println("Scan the item to find out the price");
		double price=scan.nextDouble();
		
		
		while (i<price) {
		    System.out.println("Please enter how much would you pay?");
			double cPay=scan.nextInt();
		if (price>cPay) {
		eX=price-cPay;
		System.out.println("Please Enter Extra money"+eX);
		eX=scan.nextDouble();
		break;
		}else if(price<cPay) {
			change=cPay-price;
		System.out.println("Your change is "+change+" $ ");
		break;
		}else if(price==cPay) {
			break;
		}
		}
		System.out.println("Thank you for shopping!");
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

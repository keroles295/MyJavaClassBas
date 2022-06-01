package com.syntax.class08;

import java.util.Scanner;

public class HW08022 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		double change=0; double eX=0; double t=0;
		System.out.println("Which item do you want?");
		String item=scan.next();
		System.out.println("Scan the item to find out the price");
		double price=scan.nextDouble();
		do {
		    System.out.println("Please enter how much would you pay?");
			double cPay=scan.nextInt();
			t+=cPay;
		if(price<cPay) {
		change=cPay-price;
		System.out.println("Your change is "+change+" $ ");
		break;
		}else if(price>cPay) {
		System.out.println("You should to pay "+(price-t));
		}
		}while(price>t);
		System.out.println("Thank you for shopping!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

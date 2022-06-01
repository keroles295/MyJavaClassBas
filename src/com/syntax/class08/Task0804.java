package com.syntax.class08;

import java.util.Scanner;

public class Task0804 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for(int i=1; i<=100; i++) {
			if (i%3==0) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		System.out.println("________________");
		//Create a program that will keep asking user to apply for a credit card.
		// As soon you get “yes” from a user program should stop asking
		
		    Scanner scan=new Scanner(System.in);
		    String card;
		    do {
		    	System.out.println("Do you have a credit car?");
			   card=scan.nextLine();
		    	
		    }while (!card.equals("Yes"));
		    scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}

package com.syntax.class05;

import java.util.Scanner;

public class Tasko1ClassP {

	public static void main(String[] args) {

		Scanner card=new Scanner(System.in);
		System.out.println("Do you have a creadit?");
		boolean creadit=card.nextBoolean();
		
		if (creadit) {
			System.out.println("What is your balance?");
			int balance=card.nextInt();
			if (balance>1000) {
				System.out.println("Pay off immediately");
			}else {
				System.out.println("You can spend more");
			}
			
		} else {
			System.out.println("We offer some creadits option for you");
		}
		
	
	}

}

package com.syntax.class08;

import java.util.Scanner;

public class PracticeWithMySelf08 {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		
		int b=1;
		while(b<=10) {
			System.out.print(b+" ");
			b++;
		}
		System.out.println("___________________1____________________________");

		 //print from 1 to 30 using do while
		int q=1;
		do {
			System.out.print(q+" ");
			q++;
		}while(q<=30);
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		 //print even from 70 to 30 using do while
		int r=70;
		do {
			System.out.print(r+" ");
			r-=2;
		}while(r>=30);
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		// I need to print number from 1 to 90
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		// from 60 to 10
		for(int i=60; i>=10; i--) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print numbers from 1 to 100 in 1 line with space
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print numbers from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print even numbers from 20 to 1 (2 ways)
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print even numbers from 20 to 1 (2 ways)
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print odd numbers between 20 and 50 (2 ways)
		for(int i =20; i<=50; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Print numbers from 1 to 50 except those that are divisible by 5 and 3
		for(int i=1; i<=50; i++) {
			if(i%3!=0 && i%5!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.
		Scanner scan=new Scanner(System.in);
		String card;
		
		do {
			System.out.println("Do you have a creadit card");
			card=scan.next();
			}while(!card.equalsIgnoreCase("yes"));
		
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//declare a secret number
		//you want to ask user to guess your secret number
		//you code should keep asking to guess until user gets your secret number 
		//once user gets the secret number -->you got it 
		int secNumb=22; int guesNumb;
		
		do {
		System.out.println("Can you guess that what is my secret number?");
		guesNumb=scan.nextInt();
		}while(guesNumb!=secNumb);
		
		System.out.println("You Got It!!!!!!!!!!!");
		scan.close();
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//// print number from 1 to10 except numbers 5 and 7
		for(int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		//		// write a prog to find sum of all even and all odd from 1 to 70
		int sum=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum+=i;
			}
			}
		System.out.print(sum+" ");
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		for(int i=1; i<=70; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.print(sum+" ");
		System.out.println("___________________1____________________________");
		System.out.println("___________________1____________________________");
		int eVN=0; int oDN=0; 
		for(int i=1; i<=70; i++) {
			if (i%2==0) {
				eVN+=i;
			}else { 
				oDN+=i;
			}
		}
		System.out.println("These are the Even Numbers"+eVN+"These are the Odd Numbers"+oDN+" Together "+eVN+oDN);
		

		
		
		
		
		


		






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

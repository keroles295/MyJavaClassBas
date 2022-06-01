package com.syntax.class08;

import java.util.Scanner;

public class Task0803 {

	public static void main(String[] args) {

		//declare a sercert number
		//you want to ask user to guess your secert number
		//you code should keep asking to guess until user gets your secert number 
		//once user gets the secert number -->you got it 
		int sN=13; int tSN;
		Scanner po=new Scanner(System.in);
		
		
		
		do{
			System.out.println("Can you guess what is the secret number?");
			tSN=po.nextInt();
		}while(sN!=tSN);
		
		System.out.println("You get it");
		
		
		
		
		
		
		
		
		
		
	}

}

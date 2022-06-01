package com.syntax.class04;

import java.util.Scanner;

public class MySan {

	public static void main(String[] args) {

	Scanner amaon=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=amaon.next();
	System.out.println(name);	
	System.out.println(name+" please enter your age");	
	int age=amaon.nextInt();
	System.out.println(name+" is "+age+" years old");
	System.out.println("What is your job title?");
	String job=amaon.next();
	System.out.println(job);
	System.out.println("My job title is "+job);
	System.out.println("What is your salary?");
	double incomee=amaon.nextDouble();
	System.out.println(incomee);
	System.out.println("My job title is "+job+" I earn about "+incomee);
	
	
	
		
	}

}

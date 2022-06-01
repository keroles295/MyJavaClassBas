package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		//creating a scanner
		
		Scanner input=new Scanner(System.in);
		
		//send instruction to console
		
		System.out.println("Please enter your name");
		
		//we need to grab the value from the console
		
		String name=input.next(); // make sure after you type hit enter
		System.out.println(name);
		
		//lets send instruction
		System.out.println(name+" Please enter your age");
		
		//need to capture and store age
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		

	}

}

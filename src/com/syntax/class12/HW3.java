package com.syntax.class12;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that reads two people's first names  
		//and if they expecting boy or girl? 
				//Based on the input suggests a name for a baby:
				//Example Output:
				//Mom's first name? Mary
				//Dad's first name? Daniel
				//Boy or Girl? boy
				//Suggested baby name: DANRY

				//Example Output:
				//Mom's first name? Mary
				//Dad's first name? Daniel
				//Boy or Girl? girl
				//Suggested baby name: MAIEL
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter mom's first name");
		String mom=scan.next();
		System.out.println("Enter dad's first name");
		String dad=scan.next();
		System.out.println("Enter the baby gender boy or girl");
		String baby=scan.next();
		String girlName=mom.toUpperCase().substring(0, 2)+dad.toUpperCase().substring(3, 6);
		String boyName=dad.toUpperCase().substring(0, 3)+mom.toUpperCase().substring(2, 4);
		if(baby.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name: "+girlName);
		}else if (baby.equalsIgnoreCase("boy")) {
			System.out.println("Suggested baby name: "+boyName);
		}else {
			System.out.println("No suggestion until you enter the correct gender");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkSca {

	public static void main(String[] args) {
		
		Scanner docum=new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName=docum.next();
		System.out.println("Please enter your last name");
		String lastName=docum.next();
		System.out.println("Please enter in which state do you live");
		String state=docum.next();
		System.out.println("Please enter your city");
		String cityName=docum.next();
		System.out.println("Please enter your zip code");
		int zipCode=docum.nextInt();
		System.out.println("Please enter your street name");
		String stName=docum.next();
		System.out.println("Please enter your home/apt number");
		int homeNumb=docum.nextInt();
		System.out.println(firstName+" "+lastName+" "+" lives in "+homeNumb+" "+stName+", "+cityName+", "+state+" "+zipCode);
	}
	
	
	
	

}

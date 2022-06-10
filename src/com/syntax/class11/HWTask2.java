package com.syntax.class11;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.Using Scanner create an array of countries. 
		//When an array is created, retrieve all values from it 
		//and while retrieving those values print capital for each country.
			//(use 2 different loops).
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraysize=scan.nextInt();
		String [] countryAraay= new String [arraysize];
		for(int i=0; i<countryAraay.length; i++) {
			countryAraay[i]=scan.next();//taking the input from scanner and stored it inside the array
		}
		for(String element:countryAraay) {
			if(element.equalsIgnoreCase("usa")) {
			System.out.println("Washington DC");
		}else if(element.equalsIgnoreCase("tukey")) {
			System.out.println("Ankra");
		}else if(element.equalsIgnoreCase("egypt")) {
			System.out.println("Cairo");
		}else {
			System.out.println("Country not supported by java progm");
		}

		
		}
		
		
		
		
		
		
		
		


	}

}

package com.syntax.class05;

import java.util.Scanner;

public class HomeWork0502 {

	public static void main(String[] args) {
		Scanner inform=new Scanner(System.in);
		System.out.println("What is your city?");
		String city=inform.next();
		System.out.println("What is your temperature in F?");
		double temp=inform.nextDouble();
		double tempC=(((temp-32)*5)/9);
		System.out.println("The temperature in "+city+" is "+tempC+" Celsius");

	}

}

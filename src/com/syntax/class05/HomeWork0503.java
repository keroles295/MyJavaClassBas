package com.syntax.class05;

import java.util.Scanner;

public class HomeWork0503 {

	public static void main(String[] args) {
		Scanner work=new Scanner(System.in);
		System.out.println("How long have you been work in you company?");
		int time=work.nextInt();
		System.out.println("What is your annual salary?");
		double salary=work.nextDouble();
		
		if(time>=5 && salary>=50000) {
			
				System.out.println("You are eligible for 5k bounus");
			}else if (time>=5 && salary<=50000) {
				System.out.println("You are eligible for 3k bounus");
			
		}else {
			System.out.println("You are not eligible for bounus");
		}

	}

}

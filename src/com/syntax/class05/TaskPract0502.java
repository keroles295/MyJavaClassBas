package com.syntax.class05;

import java.util.Scanner;

public class TaskPract0502 {

	public static void main(String[] args) {
		
		
		Scanner cheD=new Scanner(System.in);
		System.out.println("Enter the day number");
		int day=cheD.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It is weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Invalid day");
		}

		
	}

}

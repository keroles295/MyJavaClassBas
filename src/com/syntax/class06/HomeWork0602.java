package com.syntax.class06;

import java.util.Scanner;

public class HomeWork0602 {

	public static void main(String[] args) {
		Scanner asd=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grad=asd.next().charAt(0);
		String exp;
		
		switch(grad) {
		case 'A':
			exp="Excellent";
			break;
		case 'B':
			exp="Good";
			break;
		case 'C':
			exp="Average";
			break;
		case 'D':
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
		}
		System.out.println("Your grade is "+grad+" which is "+exp);

	}

}

package com.syntax.class05;

import java.util.Scanner;

public class HomeWork0505 {

	public static void main(String[] args) {
		Scanner born=new Scanner(System.in);
		System.out.println("What is your month of birth?");
		String month=born.next();
		
		if (month.equals("March") || month.equals("April") || month.equals("May") ) {
			System.out.println("You were born in Spring");
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in Summer");
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born in Autumn ");
		}else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were born in Winter");
		}

	}

}

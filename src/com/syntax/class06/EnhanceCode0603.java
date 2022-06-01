package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode0603 {

	public static void main(String[] args) {
		Scanner born=new Scanner(System.in);
		System.out.println("What is your month of birth?");
		String month=born.next();
		String seasn;
		
		if (month.equals("March") || month.equals("April") || month.equals("May") ) {
			seasn="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			seasn="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			seasn="Autumn";
		}else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			seasn="Winter";
		}else  {
			seasn="Invalid";
		}
		if (!seasn.equals("Invalid")) {
			
		
		System.out.println("You were born in "+seasn);
		}

	}

}

package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		
		boolean job=true;
		double salary=50000;
		
		if (job && salary>=100000) {
			System.out.println("I am so happy");
		}
		System.out.println("______________________");
		
		boolean study=true;
		boolean homeWork=true;
		boolean practice=false;
		
		if (study && homeWork && practice) {
			System.out.println("You will get better life");
			
		}else {
			System.out.println("You will struggle");
		}
		System.out.println("____________________");
		
		int a1=506;
		int a2=68;
		int a3=787;
		
		if (a1>a2 && a1>a3) {
			System.out.println("The largest number is "+a1);
		}else if (a3>a1 && a3>a2) {
			System.out.println("The largest is "+a3);
		}else if (a2>a1 && a2>a3) {
			System.out.println("The laegest is "+a2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

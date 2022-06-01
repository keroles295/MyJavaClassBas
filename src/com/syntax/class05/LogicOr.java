package com.syntax.class05;

public class LogicOr {

	public static void main(String[] args) {
		
		/*Tue and Wed->Manual testing
		 * Mon and Frid No class
		 * Thur-- Review
		 * Star and Sund -- Java
		 * 
		 */
		
		
		String day="Mond";
		
		if (day.equals("Mond") || day.equals("Friday")) {
			System.out.println("I have no class");
		}else if (day.equals("Tues") || day.equals("Wed")) {
			System.out.println("I have Manual testing");
		}else if (day.equals("Thrus")) {
			System.out.println("I have review class");
		}else if (day.equals("Sat") || day.equals("Sund")) {
			System.out.println("I have Java class");
		}
		
		

	}

}

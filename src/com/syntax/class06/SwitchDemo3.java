package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		/*let ask user where is he from 
		 * based on country we will define favorite food
		 * 
		 */
		Scanner scv=new Scanner(System.in);
		String country, fav;
		System.out.println("Please enter your country name");
		country=scv.nextLine();
		
		switch (country) {
		case "Mexico":
			fav="taco";
			break;
		case "Egypt":
			fav="Molkhalia";
			break;
		case "Turky":
			fav="Libna";
			break;
		case "USA":
			fav="Burger";
		default:
			fav="Unknown";
		
		}
		
		System.out.println("You are from "+country+" your favorite "+fav);
	}

}

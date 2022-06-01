package com.syntax.class05;

import java.util.Scanner;

public class ClassTask0501 {

	public static void main(String[] args) {

		Scanner high=new Scanner(System.in);
		System.out.println("Please enter your hight");
		int hight=high.nextInt();
		if (hight<60) {
			System.out.println("Short");
		}else if (hight>60 && hight<=72) {
			System.out.println("Medium");
			
		}else if (hight>72) {
			System.out.println("Tall");
		}
		
		
	}

}

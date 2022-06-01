package com.syntax.class04;

import java.util.Scanner;

public class HomeWork04040 {

	public static void main(String[] args) {

		Scanner homeWork=new Scanner(System.in);
		System.out.println("Can you guess which is the largest number nub1 or nub2?");
		double nub1=homeWork.nextDouble();
		System.out.println("The first choice is "+nub1);
		double nub2=homeWork.nextDouble();
		System.out.println("The second choise is "+nub2);
		if (nub1>nub2) {
			System.out.println("So "+nub1+" is the laegest number");
		}else {
			System.out.println("So "+nub2+" is the largest number");
		}
	}

}

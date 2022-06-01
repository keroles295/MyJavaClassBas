package com.syntax.class05;

import java.util.Scanner;

public class HomeWork0506 {

	public static void main(String[] args) {
		Scanner art=new Scanner(System.in);
		System.out.println("Quiz score is");
		int quiz=art.nextInt();
		System.out.println("Mid term score is");
		int midTerm=art.nextInt();
		System.out.println("Final score is");
		int finalScore=art.nextInt();
		int averg=((quiz+midTerm+finalScore)/3);
		
		if (averg>=90) {
			System.out.println("Grade A");
		}else if (averg>=70 && averg<90) {
			System.out.println("Grade B");
		}else if (averg>=50 && averg<70) {
			System.out.println("Grade C");
		}else if (averg<50) {
			System.out.println("Grade F");
			
		}
		}

	}



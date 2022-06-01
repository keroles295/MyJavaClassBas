package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode1 {

	public static void main(String[] args) {
		Scanner art=new Scanner(System.in);
		System.out.println("Quiz score is");
		int quiz=art.nextInt();
		System.out.println("Mid term score is");
		int midTerm=art.nextInt();
		System.out.println("Final score is");
		int finalScore=art.nextInt();
		int averg=((quiz+midTerm+finalScore)/3);
		char grade;
		if (averg>=90) {
			grade='A';
		}else if (averg>=70 && averg<90) {
			grade='B';
		}else if (averg>=50 && averg<70) {
			grade='C';
		}else {  
			grade='F';
		}
		
		System.out.println("You are a "+grade+" student");
	
		if (grade=='A' || grade=='B') {
			System.out.println("You are doing greate");
		}else {
			System.out.println("Please try to study more ");
		}
		
		
		
		}
}

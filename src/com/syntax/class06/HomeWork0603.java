package com.syntax.class06;

import java.util.Scanner;

public class HomeWork0603 {

	public static void main(String[] args) {
		Scanner calc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int nub=calc.nextInt();
		System.out.println("Please enter second number");
		int nub1=calc.nextInt();
		System.out.println("Please enter an operater");
		char lop=calc.next().charAt(0);
		int meth=0;
		
		
		switch(lop) {
		case '-':
			meth=(nub-nub1);
			break;
		case '+':
			meth=(nub+nub1);
			break;
		case '*':
			meth=(nub*nub1);
			break;
		case '/':
			meth=(nub/nub1);
			break;
		default:
			System.out.println("error");
		
			}
		
		System.out.println(nub+" "+lop+" "+nub1+" = "+meth);
		
		
		calc.close();
	}

}

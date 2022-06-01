package com.syntax.class06;

import java.util.Scanner;

public class HomeWork0603a {

	public static void main(String[] args) {
		Scanner calc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int nub=calc.nextInt();
		System.out.println("Please enter second number");
		int nub1=calc.nextInt();
		System.out.println("Please enter an operater");
		char lopt=calc.next().charAt(0);
		int meth=0;
		
		
		if(lopt=='-') {
		
			meth=(nub-nub1);
			
		}else if (lopt=='+') {
			meth=(nub+nub1);
			
		}else if (lopt=='*') {
			meth=(nub*nub1);
			
		}else if (lopt=='/') {
			meth=(nub/nub1);
			
		}else {
			System.out.println("error");
		
			}
		System.out.println(nub+" "+lopt+" "+nub1+" = "+meth);

		
	}

}

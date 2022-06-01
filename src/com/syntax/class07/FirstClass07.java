package com.syntax.class07;

import java.util.Scanner;

public class FirstClass07 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int nub=calc.nextInt();
		System.out.println("Please enter second number");
		int nub1=calc.nextInt();
		System.out.println("Please enter an operater");
		char lop=calc.next().charAt(0);
		int meth=0;
		String operat=null;
		
		
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
			System.out.println("Invalid operator");
			operat="invalid";
		
			}
		if (meth != 0 || operat==null) {
		System.out.println(nub+" "+lop+" "+nub1+" = "+meth);
		
		}
		calc.close();

	}

}

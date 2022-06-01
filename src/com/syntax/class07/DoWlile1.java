package com.syntax.class07;

public class DoWlile1 {

	public static void main(String[] args) {
		//while loop first check the conditions
		//and only then executes block of code
		int num=1;
		while (num<=5) {
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println(" ____________");
		//do while first executes the code 
		//and only then check the condition
		 
		 int nub=1;
		 do {
			 System.out.print(nub+" ");
			 nub++;
		 }while (nub<=5);
		 
		 //print from 1 to 30 using do while
		 int nut=1;
		 do {
			 System.out.print(nut+" ");
			 nut++;
		 }while (nut<=30);
		 //print even from 70 to 30
		 System.out.println("__________");
		 int vt=70;
		 do {
			 System.out.print(vt+" ");
			 vt -=2;
		 }while (vt>=30);

			
		 

	}

}

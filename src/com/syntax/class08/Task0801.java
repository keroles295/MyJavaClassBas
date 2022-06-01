package com.syntax.class08;

public class Task0801 {

	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space

        //Print numbers from 100 to 1

        //Print even numbers from 20 to 1 (2 ways)

         //Print odd numbers between 20 and 50 (2 ways)
		
		for(int o=1; o<=100; o++ ) {
			System.out.print(o+" ");

		}
		System.out.println("_______________1____________________________________");

		for(int i=100; i>=20; i--) {
			System.out.print(i+" ");

		}
		System.out.println("_______________1____________________________________");
		for(int t=20; t>=1; t-=2) {
			System.out.print(t+" ");

		}
		System.out.println("_______________1____________________________________");

		for (int p=20; p>=1; p-- ) {
			if (p%2==0) {
				System.out.print(p+" ");

			}
		}
		System.out.println("_______________1____________________________________");
		for (int f=21; f<=50; f+=2) {
			System.out.print(f+" ");
		}
		System.out.println("_______________1____________________________________");
		for (int m=20; m<=50; m++ ) {
			if (m%2==1) {
				System.out.print(m+" ");

			}
		}
		
		



		
	}

}

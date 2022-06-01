package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		int num=1;
		
		while (num<=10) {
			
			System.out.print(num+" ");
			num++;
		}
		
		//print numbers from 1 to 10;
		System.out.println();
        int num1=0;
		
		while (num<=10) {
			num1++;
			System.out.print(num1+" ");
			
		}
		
		//print number from 10 to 100;
		System.out.println();
		int a=10;
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		//print numbers from 10 to 1;
		System.out.println();
		
		int b=10;
		while (b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
		// from 100 to 50
		System.out.println();
		int sd=100;
		while (sd>=50) {
			System.out.print(sd+" ");
			sd--;
		}
		
		System.out.println();
		//print from -1 to -10;
		int gh=-1;
		while (gh>=-10) {
			System.out.print(gh+" ");
			gh--;
		}
		
		// print numbers from 1 to 20 but only even numbers
		System.out.println();
		int w=2;
		while (w<=20) {
			System.out.print(w+" ");
			w += 2;
		}
		// other way 
		System.out.println();
		int f=1;
		while (f<=20) {
			if(f%2==0) {
			System.out.print(f+" ");
			
			}
			f++;
			
		}
		
		//Print even numbers from 20 to 100 
		System.out.println();
		int t=20;
		while (t<=100){
			if(t%2==0) {
			
			System.out.print(t+" ");
			}
			t++;
		}
		//print only odd numbers from 100 to 1
		System.out.println();
		int o=99;
		while (o>1) {
			System.out.print(o+" ");
			o -= 2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		

	}

}

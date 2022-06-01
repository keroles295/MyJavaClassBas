package com.syntax.class08;

public class CountinueKeyWord {

	public static void main(String[] args) {

		//continue -skips current execution/iteration
		//when java executes comtinue->
		//go back to the beginning of the loop
		//so rest of the 
		for(int i=1; i<=5; i++) {
			if(i==2) {
			continue;
		}
			System.out.print(i+" ");
			System.out.println("Hello");
			System.out.println("We are going to break soon");
		}
		
		// print number from 1 to10 except numbers 5 and 7
		for (int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

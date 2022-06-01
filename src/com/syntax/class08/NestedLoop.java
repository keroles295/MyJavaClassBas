package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
  
		//it is a loop inside another loop
		//we can nest any kind of loop 
		for(int i=1; i<=3; i++) { // outer loops
			System.out.println("Hello");
			
			for(int v=1; v<=2; v++) { // Nested loop
				System.out.println("Bye ya ");
			}
		}
		
		System.out.println("__________________");
		for(int i=1; i<=3; i++) { // outer loop controls inner loop
			System.out.println(i);
			for(int y=1; y<=2; y++) {
				System.out.println(y);
			}
		
		}
		System.out.println("__________________");
		for(int i=1; i<=3; i++) { // outer loop controls inner loop
			
			for(int y=1; y<=2; y++) {
				System.out.println(i+" "+y);
			}
		
		}
		System.out.println("__________________");
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
			
			for(int y=1; y>=2; y++) {
				System.out.println("Zee");
			}
			
		}
		System.out.println("__________________");
		for(int i=1; i>=3; i--) {
			System.out.println("Hello");
			for(int y=1; y<=2; y++) {
				System.out.println("Zee");
				}
		}

		
		
		
	}

}

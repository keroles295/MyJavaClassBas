package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		String[] iceCream =new String[3];
		iceCream[0]="Chaclot";
		iceCream[1]="Butter pecan";
		System.out.println(iceCream[2]); // null
		System.out.println("______________________________");
		String[] desney= {"Shrek", "Elsa", "Goofy", "Mulan"};
		// to get all elements from an array we use for loop
		for(int i=0; i<desney.length; i++) {
			if(desney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(desney[i]+" is my favorite");
				
			}else {
				System.out.println(desney[i]+" ");

			}
		}
		System.out.println("______________________________");

		for(String names:desney) {
			if(names.equalsIgnoreCase("Mulan")) {
				continue;
			}else {
			System.out.println(names+" ");
		}
			
		}
		
		System.out.println("______________________________");

		int we=70;
		do {
			if (we%2==0) {
				
				System.out.print(we+" ");

			}
			we--;

		}while (we>=0);
		System.out.println("_______________");
		Scanner scan = new Scanner (System.in);
		String[] week= new String [7];
	    for (int i=0; i<week.length; i++){
	      System.out.println("Please enter day 1 of the week");
	      week[i]=scan.next();
	     
	      
	    }
	   
	    
	


		
		
		
		
		
		
		
		
		

	}

}

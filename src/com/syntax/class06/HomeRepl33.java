package com.syntax.class06;

import java.util.Scanner;

public class HomeRepl33 {

	public static void main(String[] args) {
		  Scanner evn=new Scanner(System.in);
		    System.out.println("Please enter a number");
		    int numb=evn.nextInt();
		    
		    
		    if (numb%2==0) { 
		    	System.out.println("Value is even");
		    	if (numb%2==0 && numb>1000) {
		    		System.out.println("Even value is large");
		    	}else {
		    		System.out.println("Even value is just right");
		    	}
		    	
		    }else if (numb%2==1) {
		    	System.out.println("Value is odd");
		    	if (numb%2==1 && numb>1000 ) {
		    		System.out.println("Odd value is large");
		    	}else {
		    		System.out.println("Odd value is just right");
		    	}
		    }
		 

		

	}

}

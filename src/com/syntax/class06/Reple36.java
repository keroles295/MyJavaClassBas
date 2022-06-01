package com.syntax.class06;

import java.util.Scanner;

public class Reple36 {

	public static void main(String[] args) {
		
		Scanner prot=new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    String word1=prot.next();
	    String word2=prot.next();
	    System.out.println("Please enter two numbers");
	    int num1=prot.nextInt();
	    int num2=prot.nextInt();

	    if (num1==num2 && word1.equalsIgnoreCase(word2)) {
	    	 System.out.println("AND");
	      }else if (num1==num2 || word1.equalsIgnoreCase(word2)){
	            System.out.println("OR");

	     
	      
	    }else {
	            System.out.println("NONE");
	    }
	      
	    }

	}



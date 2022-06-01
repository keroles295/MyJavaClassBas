package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		/*
		 * we are to ask you if got a job
		 * we will continuously asking until you say yes
		 * once you say yes --> congratulations
		 */
		
		Scanner ty=new Scanner(System.in);
		String job;
		
		do {
		System.out.println("Did you get a job?");
		job=ty.nextLine();
		}while(!job.equalsIgnoreCase("Yes"));
		System.out.println("Congratulation");
		
		System.out.println("------------------");
		
		Scanner nb=new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job?");
		offer=nb.nextLine();
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job?");
			offer=nb.nextLine();
		}
		System.out.println("Congratulation");

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

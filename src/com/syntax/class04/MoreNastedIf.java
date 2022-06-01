package com.syntax.class04;

public class MoreNastedIf {

	public static void main(String[] args) {
		
		/*
		 * we need to check if repl was completed
		 * 
		 *  if repl is completed we want to see
		 *  if you did 15 and more--> great job
		 *  if you did more than 10-->did good 
		 *  if less than 10 ---> try to complete all of them
		 */
		
		boolean didRepl=true;
		int assignment;
		
		if(didRepl) {
			
			System.out.println("How many did you do?");
			assignment=17;
			
			if (assignment>15) {
				
				System.out.println(" You did great job");
			}else if (assignment>10) {
				System.out.println("You did good job");
			}else {
				System.out.println("Please complete some more");
			}
			
			
			
		}else {
			System.out.println("You should to complete");
		}
		
	}

}

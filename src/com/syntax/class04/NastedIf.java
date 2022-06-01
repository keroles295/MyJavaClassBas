package com.syntax.class04;

public class NastedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=1;
		
		if(vaccine) {
			System.out.println("How many dose did you get?");
			
			if(dose==1) {
				System.out.println("You need 1 more shot");
			
			}else {
				System.out.println("Your are fully vacinated");
			}
		
			
		}
		
		
		System.out.println("__________________");
		
		String month="May";
		int day=19;
		
		if (month.equals("May")) {
			
			System.out.println("Let me check what is today date");
			
			if (day==8) {
				System.out.println("Today is Mother Day");
			}
			
		}else if (month.equals("June")) {
			
			System.out.println("Let me check what is today date");

			if (day==19) {
				System.out.println("Today is Father Day");
			}
		}
		

	}

}

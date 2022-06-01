package com.syntax.class04;

public class TaskClass0404 {

	public static void main(String[] args) {
		
		
		boolean diplomea=true;
		double gpea=3.4;
		
		if (diplomea) {
			System.out.println("Congratulations");
			if (gpea>=3.5) {
				System.out.println("You are elgable for schoolarshipe");
			
			}else if(gpea<=3.5) {
				System.out.println("You should to study hard");
			}
			
		}else {
			System.out.println("You should to get a degreee");
		}
		
		System.out.println("______________________");
		
		
		int rate=4;
		double homePrice=50000;
		
		if (rate<=4.5) {
			System.out.println("User will buy a house");
			if (homePrice>=50000) {
				System.out.println("User will take a loan");
			}else if (homePrice<50000)  {
				System.out.println("User will pay cash");
			}
		}else  {
			System.out.println("User will not buy a house");
		}
		
		
		
		

	}

}

package com.syntax.class06;

import java.util.Scanner;

public class HomeWork060402 {

	public static void main(String[] args) {
		Scanner sol=new Scanner(System.in);
		System.out.println("Do you have sale?");
		String sale=sol.nextLine();
		String item;
		int ds=0; int dv=0;
		int ad=0;
		if (sale.equalsIgnoreCase("yes")){
			System.out.println("whic item is that?");
			item=sol.nextLine();
			System.out.println("How much is this?");
			int price=sol.nextInt();
			switch (ds) {
			case 10:
			
				break;
			case 20:
				break;
			case 30:
				break;
			case 50:
				break;
			default:
				
				
			
			}
			
			
		}else {
			System.out.println("I will not shop");
		}
	
		
		

	}

}

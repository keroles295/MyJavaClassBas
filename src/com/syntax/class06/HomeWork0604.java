package com.syntax.class06;

import java.util.Scanner;

public class HomeWork0604 {

	public static void main(String[] args) {
		Scanner prog=new Scanner(System.in);
		System.out.println("Do you have a sale?");
		boolean sal=prog.nextBoolean();
		if (sal) {
			System.out.println("which item has a sale?");
			String item=prog.next();
	        System.out.println("What is it's price?");
			double price=prog.nextDouble();
			int dis=0; double saleprice=0; double disVal=0;
			
			if (price<=20) {
				dis=10;

			}else if (price>=20 && price<100) {
				dis=20;

            }else if (price>=100 && price<=500) {
                dis=30;

            }else if (price>500) {
                dis=50;

            }
			
			disVal=price*dis/100;
			saleprice= price-(disVal);
			  System.out.println("After disciunt of "+dis+" the price of the "+item+" rduce from "+price+" to "+saleprice);

			} else {
			System.out.println("I am not going for shopping");
			}
		
		
		

	}

}

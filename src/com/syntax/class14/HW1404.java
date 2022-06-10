package com.syntax.class14;

public class HW1404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW1404 pito=new  HW1404();
	
		pito.hello("italy");
		
		

	}
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed
	
	void hello(String count) {
		if (count.equalsIgnoreCase("Egypt")){
			System.out.println("Marhaben");
		}else if(count.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		}else if (count.equalsIgnoreCase("Italy")) {
			System.out.println("Caio");
		}else if(count.equalsIgnoreCase("Germany")) {
			System.out.println("Haloo");
		}else if(count.equalsIgnoreCase("Turkey")) {
			System.out.println("Merhaba");
		}else {
			System.out.println("Sorry, I did not translate your language");
		}
	}
	

}

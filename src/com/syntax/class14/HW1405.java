package com.syntax.class14;

public class HW1405 {

	public static void main(String[] args) {
		HW1405 pito=new HW1405();
		pito.creatEmail("Keroles", "Botros", "@gmail");

	}
	
	
	
	void creatEmail(String name, String lastName, String emType) {
		
		System.out.println(name.toLowerCase()+lastName.toLowerCase()+emType+".com");
	}
	

}

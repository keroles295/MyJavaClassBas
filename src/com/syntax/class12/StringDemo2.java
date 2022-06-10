package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName ="Adam";
		String lastName=" Jones";
		String fullName=firstName+lastName;//Alawys Always use it
		String fullName2=firstName.concat(lastName);//never use this because it can lead you to nullpointer exception
		System.out.println(fullName);
		System.out.println(fullName2);
		
		String name="";
		System.out.println(name.isEmpty());
		
		String str=" neveer "; 
		System.out.println(str.trim());// it only remove spaces just in the begging and the end it can not remove them in between
		
		
		
		
		
		

	}

}

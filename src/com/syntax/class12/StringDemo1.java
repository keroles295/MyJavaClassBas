package com.syntax.class12;

public class StringDemo1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=new String("Pito");//proper way of creating an object from a class
		String name2="Pito";// it same as String name=new String("Pit");
		//all the classes in java can created as a datatypes
		//if the class is present inside the same package or if a class belongs to java.lan package
		System.out.println(name.length());
		name2=" Z ameer ";
		System.out.println(name2.length());
		String name3="Mwzo";
		System.out.println(name3.length());
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());
		captain=" i love java";
		System.out.println(captain.toUpperCase());
		
		
		
		

	}

}

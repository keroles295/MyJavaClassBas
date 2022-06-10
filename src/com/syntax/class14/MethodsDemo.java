package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
	// Method is a block of code a group of java statement that are grouped together and
	//we can execute those statement by just creating an object of the class that contains
	//that Methods and by writing the objects name.Methods name 
	
	//Methods that return somethings and Methods that do not return something
	public static void main(String[] args) {
		MethodsDemo md= new MethodsDemo();
		md.printHeloo();
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());
		
		Scanner scan=new Scanner(System.in);
		String str1=md.returnString();
		System.out.println(str1);
		
		}
	
	
	void printHeloo() {
		System.out.println("How are you guys?");
	}
	
	
	boolean returnTrue() {
		return true;
	}
	int returnInt() {
		return 10;
	}
	String returnString() {
		return "You can";
	}
	
	
	
	
	

	

}

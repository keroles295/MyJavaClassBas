package com.syntax.class14;

public class MethodsDemo2 {
	
	
	void print() {
		for(int i=0; i<6; i++) {
			System.out.println("Pietro is great");
		}
	}
	void printMany(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Pito is great");
		}
	}
	
	
	public static void main(String[] args) {
		MethodsDemo2 nn=new MethodsDemo2();//Creating the objects of a class
		nn.print();
		nn.printMany(2);
		
		
	}
	
	
	
	
	
	
	
	

}

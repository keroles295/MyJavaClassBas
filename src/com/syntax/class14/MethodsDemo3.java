package com.syntax.class14;

public class MethodsDemo3 {
	//writ a method that takes an int values if that value is even this methods
	//return true otherwise it returns false
	//write a method that takes a string and return true if number of characters in that string
	//are enev otherwise odd
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(4));
		System.out.println(md.isString("hello"));
		
	}
		boolean isEven(int numb) {
			if(numb%2==0) {
				return true;
			}else {
				return false;
			}
		}
		
		boolean isString(String num) {
			if(num.length()%2==0) {
				return true;
			}else {
				return false;
			}
		}

		
		

	

}

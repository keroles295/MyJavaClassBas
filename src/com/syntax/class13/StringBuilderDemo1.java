package com.syntax.class13;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String and stringBuilder both are classes that we can use to store and manipulate
		//But String is immutable and StringBuilder is mutable
		//when we make a lot of changes to a String it creates multiple copies inside your memory and
		//Because of this reason because for every change a new variable is created
		StringBuilder str=new StringBuilder("Hello");
		System.out.println(str.reverse());
		
		

	}

}

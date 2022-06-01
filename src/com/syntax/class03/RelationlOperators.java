package com.syntax.class03;

public class RelationlOperators {

	public static void main(String[] args) {
		
		//>,<,>=,<=,==,!=
		
		int num1=20;
		int num2=23;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1!=num2);
		System.out.println(num1==num2);
		System.out.println(num1=num2); //23
		System.out.println(num1==num2);
		
		boolean res=100>200;
		System.out.println(res);
		
		int res1=100+200; 
		
		String res2="Emre"+10; 
		
		int num3=10;
		int num4=11;
		res=num3==num4; //if num3 equals to num4
		System.out.println(res); //false
		res=num3!=num4; //check num3  not equals to num4
		System.out.println(res); 
		
		

	}

}

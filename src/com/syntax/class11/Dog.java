package com.syntax.class11;

import java.util.Scanner;

public class Dog {

	//attributes how the object will look like
		String name;
		int age;
		double weight;   //properties or attributes or fields
		String color;
		double height;
		String breed;
		
		//how that object behave
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Doge likes to eat bone");
		}
		
		
		
		public static void main(String[] args) {
			//Scanner scan=new Scanner(System.in);
			//scan.next();
			Dog xsameh= new Dog();//how we creat an object and storing in a variable
			
			xsameh.name="xsameh";
			xsameh.age=6;
			xsameh.weight=16;
			xsameh.color="pink";
			xsameh.height=2.6;
			xsameh.breed="German";
			
			xsameh.bark();
			
			
			
		}
		

	

}

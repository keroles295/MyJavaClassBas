package com.syntax.class11;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	
	int Hp;
	
	void moveForward() {
		System.out.println("Car is moving forward");
	}
	void reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[] args) {
		
		Car bmw=new Car();
		bmw.model="X6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.Hp=500;
		System.out.println(bmw.model);
		bmw.moveForward();
		bmw.reverse();
		
		Car Honda=new Car();
		Honda.make="Honda";
		Honda.model="Civic";
		Honda.color="Gray";
		Honda.year=2022;
		Honda.moveForward();
		 
		
		
		
		
	}
	

}

package com.syntax.class09;

public class HW0902 {

	public static void main(String[] args) {


		//Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.
		String [] animals = new String [5];
		animals [0] = "Lion";
		animals [1] = "Bear";
		animals [2] = "Wolf";
		animals [3] = "Snake";
		animals [4] = "Tiger";
		for (int i =0; i<animals.length; i++ ) {
			System.out.print(animals[i]+"  ");
		}
		System.out.println("_________________");
 		String [] animalss = {"Lion", "Wolf", "Tiger", "Snake", "Bear"};
 		for (String name : animalss) {
 			System.out.print(name+" ");
 		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

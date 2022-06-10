package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner create an array of integer values. After
		//the array is created, calculate the sum of all stored
		//elements in that array.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraysize=scan.nextInt();
		int [] intarray= new int[arraysize];
		//we can not use Enhanced for loop for inserting or updating the values of array
		System.out.println("please enter "+arraysize+" ");
		for(int i=0; i<intarray.length; i++) {
			intarray[i]=scan.nextInt();//taking the input from scanner and stored it inside the array
		}
		System.out.println(Arrays.toString(intarray));
		int sum=0;
		for(int element:intarray) {
			sum=sum+element; //take the element from the array one by one and add them to the sum variable
		}
		System.out.println("The sum of all elements is "+sum);
		scan.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

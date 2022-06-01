package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		//create an Array
		
		int[] b=new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from array
		System.out.println(b[2]); //70
		System.out.println(b[1]+b[3]); //185
		
		//we need to create an array for my classmate names
		//when we create the array we must to specify the size(how many elements)

		String[] classMates=new String[5];
		//how values are stored-->stored based on index
		classMates[0]="Kyrsnyna";
		classMates[1]="Liana";
		classMates[2]="Koko";
		classMates[3]="Jenifer";
		classMates[4]="Alex";
		System.out.println("My class mate is"+classMates[3]);
		
		
		
		
		
	}

}

package com.syntax.class10;

import java.util.Scanner;

public class MyStudy {

	public static void main(String[] args) {

		//// to get all elements from an array we use for loop
		
		String [] egypt= {"Cairo", "Luxor", "Aswan", "Alexaderia"};
		for (int i=0; i<egypt.length; i++) {
			if (egypt[i].equalsIgnoreCase("Aswan")) {
				System.out.println("My favorate city is "+egypt[i]);
			}else {
				System.out.println(egypt[i]+" ");
			}
		}
		System.out.println("__________________");
		for(String city:egypt) {
			if(city.equalsIgnoreCase("alexaderia")) {
				
				continue;
			}else {
				System.out.println(city+" ");
			}
		}
		System.out.println("________________");
		//From an array of integer elements find the largest number
		int[] numb= {9, 12, 45, 28, 78, 13};
		int max=numb[0];
		for(int i=1; i<numb.length; i++) {
			if(numb[i]>max) {
				max=numb[i];
			}
			}
		System.out.println("The largest number is "+max);
		max=numb[0];
		for(int mew:numb) {
			if(mew>max) {
				max=mew;
			}
		}
		System.out.println("The largest number is "+max);
		// 
		for (int i = 0; i < 1; i++) {
            for (int j = 0; j <1; j++) {
                System.out.println("$$$$");
                System.out.println("$  &");
            }
            System.out.println("$  &");
            System.out.println("$$$$");
            
		}
		System.out.println("//////////////////////////////////");
		
		for(int i = 0; i <7; i++)
		{
		for (int j = 1;j<=7-i;j++)
		{
		System.out.print(j+" ");
		
		}
		System.out.println();
		}
		for(int x=1; x<=6; x++) {
			for(int v=1; v<=x+1; v++ ) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________");
		String[][] usa= {
				{"New York", "WE", "RTI"},
				{"YR", "FT", "UYF2", "Fgh", "ngc"},
				{"UYF", "YDVH", "IREDC", "POP"},
				{"MI", "ST", "WEER"}
		};
		for (int row=0; row<usa.length; row++) {
			for (int col=0; col<usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(String[] states:usa) {
			for(String city:states) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
		System.out.println();
		int [][] nums={
				{1, 2, 3},
				{199, 300, 588, 700},
				{1900, 4574, 98764}
			};
		for(int i=0; i<nums.length; i++) {
			for(int x=0; x<nums[0].length; x++) {
				System.out.print(nums[i][x]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int[] num:nums) {
			for(int nut:num) {
				System.out.print(nut+" ");
			}
			System.out.println();
		}
		System.out.println();
		char[] lett={'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
	    for(char i=0; i<lett.length; i+=2){
	      System.out.print(lett[i]+" ");
	      
	    }
	    System.out.println("____________________");
	    
	    System.out.println();
		System.out.println("____________________");
		
		int x=2;
	    for (int i=1; i<=10; i++ ){
	        System.out.println(i+"*"+x+"="+i*x);
	    }
	    System.out.println();
	    int[] numss={45, 78, 12, 67, 55, 89, 23, 77, 88};
	    for(int i=1; i<numss.length; i+=2) {
	      System.out.print(numss[i]+" ");
	    }
	    System.out.println("________________________");
	    System.out.println();
	    int[][] arr= {{1, 2, 3, 4, 5, 6, 7, 8},{9, 28, 32, 78, 98}};
	    int eN=0;
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
	    		if( arr[i][j] % 2 ==0) {
	    			eN=arr[i][j];
	    			System.out.println(eN);
	    		}
	    	}
	    }
	    System.out.println();
	    System.out.println();
	    Scanner input = new Scanner(System.in);
	    
	    double[] numbers = new double[5];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextDouble();
	    }
	    System.out.println(numbers);
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	    
    }    

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



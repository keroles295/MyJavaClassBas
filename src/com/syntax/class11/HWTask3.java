package com.syntax.class11;

public class HWTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.Create a 2D array of integer values. 
		//Print the sum of all numbers
		int [][] arr= { {10,12,14},
				{20,30,50},
				{90,76,40} };
		int sum=0;
		//System.out.println(arr[0][0]); //to the number 10
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr[j].length; i++) {
				sum=sum+arr[j][i];
		}
		
		
		}
		System.out.println(sum);
		


	}

}

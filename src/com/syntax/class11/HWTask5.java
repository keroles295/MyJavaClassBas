package com.syntax.class11;

public class HWTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.Create a 2D array of integers. Develop a program
		//which will calculate the sum of  even and odd numbers
		//for that array.
		int [][] arr= { {10,15,10},
				{20,50,20},
				{30,30,30} };
		int evSum=0;
		int odSum=0;
		
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr[j].length; i++) {
				if(arr[j][i] %2 ==0) {
					evSum=evSum+arr[j][i];
				}else {
					odSum=odSum+arr[j][i];
				}
            }
		}
		System.out.println(evSum);
		System.out.println(odSum);


	}

}

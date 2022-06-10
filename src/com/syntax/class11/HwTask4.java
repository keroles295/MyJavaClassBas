package com.syntax.class11;

public class HwTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.Create a 2D array or integer type where you will store
		//odd and even numbers. Develop a program which will
		//identify/print the even numbers only.
		int [][] arr= { {10,12,14},
				{20,30,50},
				{90,76,40} };
		
		//System.out.println(arr[0][0]); //to the number 10
		for(int j=0; j<arr.length; j++) {
			for(int i=0; i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
		}
		
		
		}


	}

}

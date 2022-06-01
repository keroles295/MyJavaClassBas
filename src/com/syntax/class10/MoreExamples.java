package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {

		//create 
		int [][] nums={
			{1, 2, 3},
			{199, 300, 588, 700},
			{1900, 4574, 98764}
		};
		// i loop itterates over rows
		// num.length gives # of array inside 2D array=3
		// j loop over columns
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
			}
		System.out.println("All values using enhanced for loooooop");
		//enhaced for-- uses variables to access elemnts from  an array
		//outer for-- iterates over 1D array
		//inner for -- iterates over elements of each 1d array
		//System.out.println("Retrieve all values using for each loop");
		
		for(int[] num:nums) {
			for(int i:num) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//System.out.println("Retrieve all values using for each loop");
		
		
		
		
		
		
	
		
	}

}

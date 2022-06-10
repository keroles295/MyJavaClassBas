package com.syntax.class11;

public class HWTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Write a program to print out duplicate elements from
		//an Array of Strings?
		String[] arr= {"AA", "B", "C", "A", "B"};
		for(int i=0; i<arr.length; i++) {
			for(int y=0; y<arr.length;  y++) {// or we can y=i+1;
				if(arr[i].equals(arr[y]) && i!=y) {
					System.out.println(arr[i]);
				}
				
			}
		}
		
		
		
		
		
		
		
		
		


	}

}

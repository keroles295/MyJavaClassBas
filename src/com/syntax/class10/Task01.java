package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		
		//From an array of integer elements find the largest number
		int [] let= {12, 23, 7, 18, 2};
		int max =let[0];
		for (int i=1; i<let.length; i++) {
			if(let[i]>max) {
				max=let[i];
			}
		}
		System.out.println("The largest value ="+max);
		System.out.println("____________________");
		max =let[0];
		for(int num:let) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("The largest value ="+max);


		
		
		
	}

	
	

}

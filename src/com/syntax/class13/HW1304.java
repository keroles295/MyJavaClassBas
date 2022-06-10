package com.syntax.class13;

public class HW1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How would you reverse a String word by word? for example
				// input=>This is sentence i want to reverse
				// output=>sihT si ecnetnes i tnaw ot esrever
		String str="This is sentence i want to reverse";
		
		for(int i=str.length()-1; i>0; i--) {
		System.out.print(str.charAt(i));
		}
		System.out.println();
		String [] arr=str.split(" ");
		for(String nuk:arr) {
			System.out.print(new StringBuilder(nuk).reverse()+" ");
			
		}
		

		
		
		
		
		

	}

}

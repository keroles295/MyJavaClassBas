package com.syntax.class12;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.
		
		
		String naz="You will nevEr walk alone";
		int mid=0;
		
		
		if (!naz.isEmpty()) {
			if (naz.length()%2 !=0 && naz.length()>=3 ) {
				mid=(naz.length())/2;
				System.out.println(naz.charAt(mid));
				
			}
		}else {
			System.out.println("string is Empty");
		}
		
		
		
		


	}
}


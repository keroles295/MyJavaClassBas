package com.syntax.class09;

public class HW0904 {

	public static void main(String[] args) {

		
		//Create an array on integers and calculate the sum of all elements in an array
		
		 int [] num = {10, 222, 3, 4, 5};
		 int sum=0;
		 for(int y:num) {
			 sum+=y;//x=x+y;
			 
		 }
		 System.out.println("The sum of the element of = "+sum);

		 
		 sum=0;
			for(int i=0; i<num.length; i++) {
				sum+=num[i];//sum=sum+num[1];
				
				System.out.println("The sum of the element = "+sum);
			}
			System.out.println("The sum of the element = "+sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

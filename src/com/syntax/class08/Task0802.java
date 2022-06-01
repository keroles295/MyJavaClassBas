package com.syntax.class08;

public class Task0802 {

	public static void main(String[] args) {
		// write a prog to find sum of all even and all odd from 1 to 70
		
		int sum=0;
		for (int i=0; i<=70; i++) {
			if (i%2==0) {
				sum+=i;
				}
			}
		System.out.print(sum+" ");
		System.out.println("__________________________");
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum+=i;
				}
		    }
		System.out.print(sum+" ");
		
		System.out.println("__________________________");
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=70; i++ ) {
			if(i % 2 == 0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("SumEveen is"+sumEven);
		System.out.println("SumOdd is "+sumOdd);

		

	}

}

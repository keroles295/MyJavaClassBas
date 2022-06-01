package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		//break -breaks block of code

		for(int i=1; i<=5; i++) {
			System.out.println("Zello");
			if(i==3) {
			break;
			}
		}
		
		boolean sumer=true;
		int temp=95;
		while(sumer) {
			System.out.println("It is hot");
			if(temp<70) {
				System.out.println("It is not hot");
				break;
			}
			temp-=5;
		}
		System.out.println("__________________________________");
		
		
		boolean sum=true;
		int tem=95;
		while(sum) {
			if(tem<70) {
				System.out.println("It is not hot");
				break;
			}
			System.out.println("It is hot");
			tem-=5;

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.syntax.class14;

public class HW1406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW1406 pito=new HW1406();
		pito.prime(15);

	}
	//Write a method to return whether given number is prime or not?
	void prime (int nuy) {
		boolean isp=true;
		for (int i=2; i<=nuy; i++) {
			if(nuy%i ==0) {
				isp=false;
				break;
			}
		}
		if(isp) {
			System.out.println(nuy+" is a prime number");
		}else {
			System.out.println(nuy+" is not a prime number");
		}
	}


}

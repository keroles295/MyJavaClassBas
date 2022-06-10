package com.syntax.class11;

public class HWTask9 {
	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		int[] arr= {10,20,50,5,8,13};
		int maxNum=arr[0];
		int minNum=arr[0];
		
		for(int num:arr) {
			if(num>maxNum) {
				maxNum=num;
			}else if(num<minNum) {
				minNum=num;
			}
		}
		System.out.println(maxNum);
		System.out.println(minNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

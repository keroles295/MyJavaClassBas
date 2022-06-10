package com.syntax.class11;

import java.util.Arrays;

public class HWTask10AnthorWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,3,6,8,9,200};
		int maxNum=arr[0];
		int secLarg=arr[0];
		for(int num:arr) {
			if(num>maxNum) {
				secLarg=maxNum;
				maxNum=num;
			}
			if(num>secLarg && secLarg<maxNum && num<maxNum) {
				
				secLarg=num;
			}
			
		}
		
		System.out.println(maxNum);
		System.out.println(secLarg);
		
		

	}

}

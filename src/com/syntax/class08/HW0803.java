package com.syntax.class08;

import java.text.DecimalFormat;

public class HW0803 {

	public static void main(String[] args) {

		//Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2  digits for a minute.
		DecimalFormat clock=new DecimalFormat("00");
		for(int i=0; i<=23; i++) {
			for (int x=0; x<=59; x++) {
				
				
					System.out.println(clock.format(i)+" : "+clock.format(x));
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

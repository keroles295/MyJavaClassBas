package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		
		
		String[][] usa= {
				{"New York", "WE", "RTI"},
				{"YR", "FT", "UYF2", "Fgh", "ngc"},
				{"UYF", "YDVH", "IREDC", "POP"},
				{"MI", "ST", "WEER"}
		};
		
		//outer loop interates over rows
		//inner loop interates over columns
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col<usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Retrieve all values using for each loop");
		for(String[] states:usa) {
			for(String city:states) {
				System.out.print(city+" ");
			}
			System.out.println();
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.syntax.class10;

public class AnotherWayOf2Darray {

	public static void main(String[] args) {
		
		//create 2d array of states
		//1 array-> NY-->all cities of NY
		//2 array->CA-->all cities of CA
		//3 array->FL-->of FL
		//4 array--> VA
		String[][] usa= {
				{"New York", "WE", "RTI"},
				{"YR", "FT", "UYF2", "Fgh", "ngc"},
				{"UYF", "YDVH", "IREDC", "POP"},
				{"MI", "ST", "WEER"}
		};
		System.out.println(usa[1][2]);//UYF2
		System.out.println(usa[2][0]);//UYF
		System.out.println("The # of 1d arrays in array usa ="+usa.length);
		// I want to see how many elements in my first array
		int elem1array=usa[0].length;
		System.out.println("# of elements of my 1d array"+elem1array);
		// I want to see how many elements in my 2 array
		int elem2array=usa[1].length;
		System.out.println("# of elements of my 2d array"+elem2array);
		int elemt3array=usa[2].length;
		System.out.println("# of elements of my 3d array"+elemt3array);

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}

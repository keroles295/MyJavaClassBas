package com.syntax.class14;

public class HW1407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
		//score > 90 - A
		//score >80 - B
		//score >70 - C
		//score > 50 - D
		//anything else - F
		HW1407 pito= new HW1407();
		pito.grade(80);
		System.out.println(pito.grade(81));
		

	}
	char grade(int num) {
		if(num>=90) {
			return 'A';
		}else if(num<90 && num>=80) {
			return 'B';
		}else if(num<80 && num>=70) {
			return 'C';
		}else if(num<70 && num>=50) {
			return 'D';
		}else {
			return 'F';
		}
		
		
	}
	

}

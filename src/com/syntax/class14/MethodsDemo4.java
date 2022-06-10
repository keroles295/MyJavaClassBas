package com.syntax.class14;

public class MethodsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo4 md=new MethodsDemo4();
		md.sumNumb(10, 79);
		System.out.println(md.sumNumb(10, 79));
		md.printManytimes("Java", 5);

	}
	//write a methods takes string and int and printsout that string on consule
	//that many times that value that we can in int.
	int sumNumb(int num1, int num2) {
		return num1+num2;
	}
	
	void printManytimes(String str, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(str);
		}
	}
	

}

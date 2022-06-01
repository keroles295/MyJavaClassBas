package com.syntax.class09;

public class Hw03Fix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<24; i++) {
					for (int t=0; t<60; t++) {
						String time;
						if (i<10 && t<10) {
							time="0"+i+":"+"0"+t;
						}else if(i<10 && t>=10) {
							time="0"+i+":"+t;
						}else if(i>=10 && t<10 ) {
							time=+i+":"+"0"+t;
						}else {
							time=+i+":"+t;
	                    }
						System.out.println(time);
					}
				}
		
		System.out.println("_____________________________");
		for (int a=0; a<=2; a++ ) {
			for(int b=0; b<=9; b++) {
				if (a==2 && b==4) {
					break;
				}
				for(int c=0; c<6; c++) {
					for(int d=0; d<10; d++) {
						System.out.println(a+""+b+":"+c+""+d);
					}
				}
			}
		}
		
		System.out.println("_____________________");
		
		

	}

}

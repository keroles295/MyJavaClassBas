package com.syntax.class07;

public class MySelfStudy {

	public static void main(String[] args) {
		//Print even numbers from 400 to 100
		int n=400;
		while (n>=100) {
			System.out.print(n+" ");
			n-=2;
		}
		// other way 
		System.out.println("_______________________");
		int d=400;
		while (d>=100) {
			if (d%2==0) {
				System.out.print(d+" ");
			}
			d--;;
		}
		
		// //Print even numbers from 19 to 107
		System.out.println("_______________________________");
		int m=17;
		while(m<=107) {
			if(m%2==0) {
				System.out.print(m+" ");
			}
			m++;
		}
		//2 way
		System.out.println("________________");
		int o=18;
		while (o<=108) {
			System.out.print(o+" ");
			o+=2;
		}
		//		// //Print odd numbers from 1 to 38
		System.out.println("_________________");
		int p=1;
		while (p<=38) {
			System.out.print(p+" ");
			p+=2;
		}
		System.out.println("____________2_________________");
		int l=1;
		while(l<=38) {
			if(l%2==1) {
				System.out.print(l+" ");
			}
			l++;
		}
		System.out.println("_________________8_____________________");
		//// //Print odd numbers from 37 to 0
		int y=39;
		while(y>=0) {
			System.out.print(y+" ");
			y-=2;
			
		}
		System.out.println("______________9__________________");
		int x=38;
		while(x>=0) {
			if (x%2==1) {
			System.out.print(x+" ");
		}
			x--;
		}
		// //Print odd numbers from -1 to -38
		int z=-1;
		while(z>=-38) {
			System.out.print(z+" ");
			z-=2;
		}
		System.out.println("_____________1_______________________");
		int zx =-1;
		while(zx>=-38) {
			if(zx%2==-1) {
				System.out.print(zx+" ");
			}
			zx--;
		}
		// //Print even numbers from -100 to -38
		int u=-100;
		while (u<=-38) {
			System.out.print(u+" ");
			u+=2;
		}
		int ty=-100;
		while(ty<=-38) {
			if(ty%2==0) {
				System.out.print(ty+" ");
		}
			ty++;
		}
		System.out.println("______________4___________________");
		 //print even from 70 to 30
		int qa=70;
		do {
			System.out.print(qa+" ");
			qa -=2;
		}while(qa>=30);
		
		System.out.println("______________4___________________");
		int we=70;
		do {
			if (we%2==0) {
				System.out.print(we+" ");
			}
			we--;
		}while (we>=0);


		
	}

}

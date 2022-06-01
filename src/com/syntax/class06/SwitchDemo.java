package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		//

		char choice='Y';
		String mean;
		
		switch(choice) {
		case 'Y':
			mean="Yes";
			break;
		case 'M':
			mean="Maybe";
			break;
		case 'N':
			mean="No";
			break;
		default:
			mean="Unknown";
		}
		System.out.println(mean);
		
	}

}

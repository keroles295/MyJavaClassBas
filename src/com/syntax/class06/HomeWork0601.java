package com.syntax.class06;

import java.util.Scanner;

public class HomeWork0601 {

	public static void main(String[] args) {
		
		Scanner sdf=new Scanner(System.in);
		String lang;
		System.out.println("Where are you from?");
		String cont=sdf.next();
		
		
		
		switch (cont) {
		case "Egypt":
			lang="Aribac";
			break;
		case "France":
			lang="French";
			break;
		case "UK":
			lang="English";
			break;
		case "Denmark":
			lang="Danish";
			break;
		default:
			lang="Unknown";
		}
		
		System.out.println("Your home language is "+lang);
		
		

	}

}

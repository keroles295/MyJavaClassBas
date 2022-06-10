package com.syntax.class12;

public class Task01 {

	public static void main(String[] args) {
		
		
		
		
		String userName="admin";
		String password="pass123456";
		String confirmPass="pass123456";
		if(userName.isEmpty()||password.isEmpty() ) {
			System.out.println("username and password can not be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password can not contain user name");
		}else if(!password.equals(confirmPass)) {
			System.out.println("Password does not match");
		}else {
			System.out.println("Your username and password has been created");
		}

	}

}

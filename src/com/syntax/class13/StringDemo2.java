package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sdgugwiu1234567ASDFGHJ!@#$%()?~|";
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "#"));//^ every thing expext ^a-z
		System.out.println(str.replaceAll("[^A-Z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		str="abcdefghijklmKJHGFD1234!@#$";
		System.out.println(str.replaceAll("[a-g]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "^"));
		System.out.println(str.replaceAll("[^A-z]", ""));




		

	}

}

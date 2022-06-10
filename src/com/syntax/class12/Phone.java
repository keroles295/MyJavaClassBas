package com.syntax.class12;

public class Phone {
	String make;
	String model;
	double screenSize;
	int ram;
	int rom;
	int storage;
	int camera;
	void call (){
	System.out.println("Calling someone");	
	}
	void takePhotos(){
		System.out.println("use the camera to take photo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone s22= new Phone();
		s22.make="Samsung";
		s22.model="Samsung galaxy s22 Ultra";
		s22.screenSize=6.8;
		s22.ram=12;
		s22.storage=512;
		s22.camera=20;
		System.out.println(s22.storage);
		s22.call();
		
		

	}

}

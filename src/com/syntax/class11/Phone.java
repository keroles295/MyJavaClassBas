package com.syntax.class11;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung 
	//with specific  attributes and behaviors.
	
   
   String model;
   String color;
   int camera;
   double length;
   double width;
   double weight;
   int memory;
   double chargeTime;
   void calls() {
	   System.out.println("Phone takes calls");
	   
   }
   void text() {
	   System.out.println("It texts");
   }
     public static void main(String[] args) {
		
    	Phone iphone = new Phone();
    	iphone.model="13 pro max";
    	iphone.color="Gray";
    	iphone.camera=3;
    	iphone.length=5.6;
    	iphone.width=3.7;
    	iphone.weight=.4;
    	iphone.memory=260;
    	iphone.chargeTime=1.5;
    	iphone.calls();
    	iphone.text();
    	
    	Phone samsungs20= new Phone();
    	samsungs20.model="s20";
    	samsungs20.color="Pink";
    	samsungs20.camera=4;
    	samsungs20.length=5.68;
    	samsungs20.width=3.27;
    	samsungs20.weight=.34;
    	samsungs20.memory=256;
    	samsungs20.chargeTime=2;
    	samsungs20.calls();
    	samsungs20.text();
    	
    	Phone pixel =new Phone();
    	pixel.model="x23";
    	pixel.color="black";
    	pixel.memory=234;
    	pixel.calls();
    	pixel.weight=.45;
    	pixel.text();
    	
    	
    	
    
    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

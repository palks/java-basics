package com.pallavi.basics;

public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		Automobile myCar = new Car();
		Automobile myBike = new Bike();
		
		AutoUtil util = new AutoUtil();

		util.processAutomobile(myCar);
		util.processAutomobile(myBike);
		
		
	}
	

}

package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	public static void testCar() {
		Car firstCar=new Car("TN 60 AW 9673");
	firstCar.setFuel("Petrol");
	firstCar.setColor("Red");
	firstCar.setYearOfpurchase(2022);
	System.out.println(firstCar.getRegNo());
	System.out.println(firstCar.getColor());
	System.out.println(firstCar.getFuel());
	System.out.println(firstCar.getYearOfpurchase());
	
	}}


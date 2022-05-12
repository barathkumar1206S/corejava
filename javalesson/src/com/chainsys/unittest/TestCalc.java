package com.chainsys.unittest;

import com.chainsys.interfaces.Calculator;
import com.chainsys.interfaces.ICalculator;

public class TestCalc {

	public static void main(String[] args) {
	
		Calculator c=new ICalculator();
		System.out.println("Addition  is "+ c.add(3,4));
		System.out.println("Multiplication  is "+ c.multiply(7, 7));
		System.out.println("Division  is "+ c.divide(10,2));
		

	}

}

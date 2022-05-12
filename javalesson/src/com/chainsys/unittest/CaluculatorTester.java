package com.chainsys.unittest;

import com.chainsys.variables.Calculator;
/**
 * 
 * @author bara3134
 * mar 25 2022
 *
 */

public class CaluculatorTester {
	public static  void addMethod() {
		Calculator.add(5,60 );
	System.out.println("Add value is :"+Calculator.add(5, 60));
	}
	public static void multiplyMethod() {
		Calculator.multiply(5,6 );
		System.out.println("Multiply value is :"+Calculator.multiply(5,6 ));
	}
	public static void subtractMethod() {
		Calculator.subtract(60,57 );
		System.out.println("Subtract value is :"+Calculator.subtract(60,57 ));
		
	}
	public static void divideMethod() {
	
		System.out.println("Divide value is :"+Calculator.divide(75,5 ));
	}

};

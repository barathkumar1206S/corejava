package com.chainsys.unittest;

import com.chainsys.variables.Demo;

/**
 * 
 * @author bara3134
 *
 */
public class VariableTester {

	// test static variable

	public static void testGlobalVariable() {
		// display the value of static field
		// value is zero (default value)
		// DataA is accessed without creating an object
		System.out.println("DataA: " + Demo.DataA);
		// display the value of immutable field
		// this is not possible without an object
		// System.out.println("DataB: " + Startup.DataB);
		// display the value of constant field

		System.out.println("DataC: " + Demo.DataC);
		// modifying value of the static field DataA
		Demo.DataA = 2345;
		System.out.println("DataA: " + Demo.DataA);
		// modifying value of the static field DataC
		// ERROR: The final field Startup.DatC cannot be assigned
		// Startup.DataC=2345;
	}

	public static void testImmutableVariable() {
/* Cannot make a static reference to the non- static field Demo.DataB*/
 // Demo.DataB=123;
		/**
		 * first create an object for the class
		*pass an int value as an argument to the constructor
		**access the immutable field can be assigned only through the constructor
		 */
		Demo firstObject= new Demo(123);
	System.out.println(firstObject.DataB);
	/**
	 * value assigned to an immutable-field cannot be changed 
	 * *value for the immutable field can be assigned only through the constructor
	 * */
	//firstObject.DataB=567;
	}
	/**
	 *calling static method using Class name
	*without creating an object
	*Created on :25 march 2022
	 */
	public static void testStaticMethod() {
		Demo.sayHello();
	}
	/**
	 *calling static non- method using Class name
	*without creating an object
	*Created on :25 march 2022
	 */
	public static void testNonStaticMethod() {
		//ERROR
		//Demo.greetUser();
		Demo firstObject=new Demo(111);
		//call  the non static method 
		firstObject.greetUser();
		
	}
}

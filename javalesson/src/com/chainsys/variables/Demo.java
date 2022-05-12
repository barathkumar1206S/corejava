package com.chainsys.variables;

public class Demo {
	public static int DataA;//static global variable
	public final int DataB; //immutable global variable (not static)
	public final static int DataC=300; //constant
	
	
	//constructor
	/*Constructor is a special method
	 * The name of the constructor and the name of the class will  be the same
	 *Constructor don't have return type
	 */
	public Demo(int dataB)
	{/*ASsigning Value to the globalread_only field(this.DataB)
	*/
		this.DataB=dataB;
	}
	//static method can be called without an object
	public static void sayHello() {
		System.out.println("Hello Deveoper!!!");
	}
	//non static method
	public void greetUser()
	{
		System.out.println("Greetings User!!!");
	}

	
	}



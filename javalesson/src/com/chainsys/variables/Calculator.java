package com.chainsys.variables;
/*
 * created on :25 march 2022
 * */

public class Calculator {
	/**
	 * Add method takes 2 integer values using the following parameters, 
	 *and will add the values.The result of totaling will be returned to the caller
	 **This is a static method ,object references is not required.
	 * *@param param1 of type int
	 * *@param param2 of type int
	 * *@return type int 
	 * */ 
	public static int add(int param1, int param2)
	{
	
		int result=param1+param2;
		return result;
	}
	/**
	 * Multiply method takes 2 integer values using the following parameters, 
	 *Multiply  the values.The result of totaling will be returned to the caller
	 *This is a static method ,object references is not required.
	  *@param param1 of type int
	 * *@param param2 of type int
	 * *@return type int 
	 * */ 
	public static int multiply(int param1, int param2)
	{
	
		int result=param1*param2;
		return result;
	}
	/**
	 * Divide method takes 2 integer values using the following parameters, 
	 * Divide the values.The result of totaling will be returned to the caller
	 **This is a static method ,object references is not required.
	 * *@param param1 of type int
	 * *@param param2 of type int
	 * *@return type int 
	 * */ 
	public static int divide(int param1, int param2)
	{
		if(param2==0) {
			System.out.println("value of ");
		}
	
		int result=param1/param2;
		return result;
	}
	public static int subtract(int param1, int param2)
	{
	
		int result=param1-param2;
		return result;
	}
	


}
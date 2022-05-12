package com.chainsys.exceptions;

import java.util.Scanner;

public class DemoTrace {
	public static void m1() {
		try {
			m2();
		}
		catch(Exception err) {
			System.out.println("getMessage"+err.getMessage());
			err.printStackTrace();
		/*	Throwable t1Throwable=err.getCause();
			if(null!=t1) {
				class c1=t1.getClass();
				System.out.printl("Casue"+c1.getName());
			}
			else
				System.out.println("Cause is Null");
			
		*/
		
		}
		finally
		{
			System.out.println("Inside m1 finally");
		}
		}
	public static void m2() {
		m3();
	}
	public static void m3() {
		m4();
	}
	public static void m4() {
		System.out.println("Before Try");
		int x=0,y=0,z=0;
    String s1=null,s2=null;
java.util.Scanner sc=null;
    try 
      {
	sc=new Scanner(System.in);
	System.out.println("Inside Try");
	System.out.println("Enter value for X");
	s1=sc.nextLine();
	System.out.println("Enter value for Y");
	s2=sc.nextLine();
	x=Integer.parseInt(s1);
	y=Integer.parseInt(s2);
	z=x/y;
	System.out.println("Result"+z);
	}
    catch(ArithmeticException err)
    {
     	System.out.println("Inside Catch1"+err.getMessage());
    	System.out.println("ErrorType"+err.getMessage());
    	
    }	
	catch(NumberFormatException err) {
		System.out.println("Inside Catch2"+err.getMessage());
    	System.out.println("ErrorType"+err.getMessage());
    	
    }
    catch(Exception err)
    {
    	System.out.println("Inside Catch3"+err.getMessage());
    	System.out.println("ErrorType"+err.getMessage());
    }
    finally
    {
    	System.out.println("Inside Finally");
    	sc.close();
    }
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m4();

	}

}

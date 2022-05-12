package com.chainsys.bytestreams;

import java.io.IOException;

public class SystemsIN {

	public static void main(String args[]) throws IOException
	{
		// TODO Auto-generated method stub
		
		    System.out.println (System.in.getClass ().getName());
		    System.out.println (System.out.getClass().getName()); System.out.println("Please Enter a Char: ");
		    int cl=System.in.read();
		    System.out.println (cl);
		    char c2=(char) cl;
		    System.out.println (c2);

		}
		

	

}

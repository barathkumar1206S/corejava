package com.chainsys.testprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		    int value=sc.nextInt();
		    sc.close();
		   
		int a=value/100;
		int b=value%100;
		int c=b/10;
		int d=value%100;
		int e=d%10;
		int tamp=((a*a*a)+(c*c*c)+(e*e*e));


		     
		if(tamp==value)
		System.out.println ("armstrong  number ");    
		else    
		System.out.println ("not armstrong number");    


		}
		


	
}

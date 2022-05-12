package com.chainsys.arrays;

import java.util.Arrays;
/*
 * @author bara3134
 * */
import java.util.Scanner;

public class DemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstintArray[] = new int[10];
		// int secondintArray[4]= {1,2,3,4};
		int secondintArray[] = { 1, 2, 3, 4 };
		System.out.println(firstintArray);
		System.out.println(secondintArray);
	}

	public static void creatingArrays() {
		int firstValue = 100;
		int[] numbers = { 10, 20, 30, 40, 50 };
		int lengthofnumbers = numbers.length;
		System.out.println(lengthofnumbers);
		for (int x : numbers) {
			System.out.print(x + ",");
		}
		System.out.println();
	}

	public static void creatingAnotherArray() {

		int days[];
//	   if(days==null) {}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of day");
		int size = sc.nextInt();
		sc.close();
		days = new int[size];
		int lengthofdays = days.length;
		System.out.println("No of Days:" + lengthofdays);
		for (int i = 0; i < lengthofdays; i++) {
			days[i] = (int) (Math.random() * 10);

		}
		for (int x : days) {
			System.out.println();
		}
	}

	public static void createMonthArray() {
		int month[] = new int[12];
		int lengthofmonth = month.length;
		System.out.println("Array length is:" + lengthofmonth);
		for (int i = 0; i < lengthofmonth; i++) {
			System.out.println(i + "-" + month[i] + ",");

		}
		System.out.println();
		month[1] = 31;
		for (int i = 0; i < lengthofmonth; i++) {
			System.out.println(i + "-" + month[i] + ",");

		}
		try {
			month[11] = 31;
			System.out.print("Hi...");

		} catch (Exception err) {
			System.out.println("ERROR!!!" + err.getMessage());
		}

	}

	public static void workingWithArraysClass() {
	   int numberArray[]= new int [10];
	   for(int i=0;i<10;i++)
	   numberArray[i]=-3*i;
	   System.out.println("Original contents :" );
	   int lengthofthearray =numberArray.length;
	   System.out.print("Array length is: "+lengthofthearray);
	  for(int i=0;i<lengthofthearray;i++)
	   { 
		  System.out.println(numberArray[i]+ " ");
	   }
	   // Arrays sort
	   Arrays.sort(numberArray);
	   System.out.println("Sorted :");
	   for(int i=0;i<lengthofthearray;i++)
	   {
	    System.out.print(numberArray[i]+ " ");
	   }
	  Arrays.fill(numberArray,2,6,-1);
	  System.out.println();
	   System.out.println("After fill");
	    for(int i=0;i<lengthofthearray;i++)
	    {
	    System.out.print(numberArray[i]+ " ");
	    }
	    System.out.println();
	   
	   int index = Arrays.binarySearch(numberArray, -9);
	   System.out.println(index); // wrong value
	    Arrays.sort(numberArray);
	   for(int i=0;i<lengthofthearray;i++)
	   {
	 System.out.print(numberArray[i]+ " ");
	   }
	  index= Arrays.binarySearch(numberArray, -9);
	    System.out.println(index);}

 
	public static void workingWithCharArray() {
	String s1="Today is very hot day";
	char[] data=s1.toCharArray();
	int count=data.length;
	System.out.println(count);
	for(int i=0;i<count;i++) {
		System.out.println(data[i]+""+(int)data[i]);
	}
	}

	
	
}

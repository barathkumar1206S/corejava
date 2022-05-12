package com.chainsys.testprogram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a Word");
	    	String s2 = scanner.nextLine();
	    	scanner.close();
	    	int stringlength = s2.length();
	    	System.out.println("The count of the String is:" + stringlength);
	    	
	        System.out.println("Enter the word");
            String a="Tom and jerry are good friends";
	        String b="";
	        char[] charSentence=a.toCharArray();
	        for(int index=charSentence.length-1; index>=0; index-- )
	        {
	                b=b+charSentence[index];
	        }
	        System.out.println(b);

	


}}

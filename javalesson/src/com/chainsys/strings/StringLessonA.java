package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {
	/*
	 * @author bara3134 28 mar 2022
	 */

	public static void lessOne() {
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[] = { 'C', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'C', 'h', 'a', 'i' });
		System.out.println(thirdString);

	}
	public static void lessonTwo() {

		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secondString);

		firstString = "welcome";
		System.out.println(firstString);
		System.out.println(secondString);

	}
	public static void creatingStringInaLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "Hello";
		}

	}
	public static void stringToCharArray() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength = firstString.length();
		System.out.println("Length" + stringlength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;
		System.out.println("Length" + dataarraylength);
	}
	public static void stringToUpperLower() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a Word");
		String firstString = scanner.nextLine();
		scanner.close();
		String stringInUpperCase = firstString.toUpperCase();
		System.out.println("toUppercase=" + stringInUpperCase);
		System.out.println("s1=" + firstString);
		String stringInLowerCase = firstString.toLowerCase();
		System.out.println("toLowerCase=" + stringInLowerCase);
		System.out.println("s1=" + firstString);

		// substring
		String subString = firstString.substring(3);
		System.out.println(subString);
		subString = firstString.substring(2, 6);
		System.out.println(subString);
		// replace
		String replacedString = firstString.replace('a', 'e');
		System.out.println(replacedString);
		// equals
		boolean flag1 = firstString.equals(stringInUpperCase);
		System.out.println(flag1);
		// equalsIgnoreCase
		boolean flag = firstString.equalsIgnoreCase(stringInUpperCase);

		System.out.println(flag);
	}
	
	public static void testStringTrim() {
		String secondString="Hope   it   rain";
		
		System.out.println("BeforeString:"+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim:"+secondString.length());
	}
public static void testSplit() {
	String firstString="Tom and Jerry are good friends";
	String trimmedString=firstString.trim();
	String[] data=trimmedString.split(" ");
	int count = data.length;
	System.out.println("Word Count"+ count);
	for(int index=0;index<count;index++) {
         System.out.println(data[index]);                                       	
	}
	}
	public static void testSplitDays() {
		String weekdays = "Mon;Tue;Wed;Thu;fri;Sat;Sun";
		String[] data= weekdays.split(";");
		int count=data.length;
		System.out.println("Days Count"+count);
		for(int index=0;index<count;index++) {
		System.out.println(data[index]);	
		}	
	}
	public static void reverse()
    {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence="";
        try
        {
            sentence=scanner.nextLine();
            
        }
        finally
        {
            scanner.close();
        }
        int reverseString=sentence.length();
        while(reverseString>0)
        {
            System.out.print(sentence.charAt(reverseString-1));
            reverseString--;
        }
    }
	public static void testReverseString() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word");
        String a="";
        String b="";
        try
        {
                a=scanner.nextLine();
        }
        finally
        {
                scanner.close();
        }
        char[] charSentence=a.toCharArray();
        for(int index=charSentence.length-1; index>=0; index-- )
        {
                b=b+charSentence[index];
        }
        System.out.println(b);
}
	public static void verifyStringreverse(String s1) {
		if(null==s1) {
			System.out.println("String is Null");
			return;
		}
		else
			System.out.println("String is NOT Null"+s1);
		
		if(!s1.isEmpty())
			System.out.println("\t Not Empty"+s1);
		else
			System.out.println("\t String is Empty");
	}
	}


package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		byte b1=122;
		System.out.println("b1:"+b1);
        short s1 = 1000;
        System.out.println("s1:"+s1);
       
       
	


		byte byteminvalue=-128;
		System.out.println("byteminvalue :" +byteminvalue);
		byte bytemaxvalue=127;
		System.out.println("bytemaxvalue " +bytemaxvalue);

		short shortMaxValue=32767;
		System.out.println("sl :" +shortMaxValue);
		short shortminvalue=-32768;
		System.out.println("sl :" +shortminvalue);

		long longminvalue=-9223372036854775808L;
		System.out.println(longminvalue);
		long longmaxvalue=9223372036854775807L;
		System.out.println(longmaxvalue);
		float floatminvalue=-217483648.11111F;
		System.out.println(floatminvalue);
		float floatmaxvalue= 217483647.5432F;
		System.out.println(floatmaxvalue);
		double doubleminvalue=-217483648.11111F;
		System.out.println(doubleminvalue);
		double doublemaxvalue= 217483647.5432F;
		System.out.println(doublemaxvalue);
		char c1= 'A';
		System.out.println(c1);
		char c2='a';
		System.out.println(c2);
		int asciivalue=(int )c1;
		System.out.println(asciivalue);
		char c3=(char) 89;
		System.out.println(c3);

		boolean flag=true;

		System.out.println(flag);

		}
}

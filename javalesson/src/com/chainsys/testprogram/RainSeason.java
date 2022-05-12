package com.chainsys.testprogram;

import java.util.Scanner;

public class RainSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc =new Scanner(System.in);
           System.out.println("Enter  temperature Now");
           int T=sc.nextInt();
           if(T<20) {
                   System.out.println("It's rainy seanson to get an umbrella");
           }
           else if(T<32) {
                   System.out.println("To bring heavy Jacket");
           }
           else if(T>=32&&T<=50) {
                   System.out.println("To bring a light Jacket");
           }
           else {
                   System.out.println("No jacket to take this time");
           }
	}

}

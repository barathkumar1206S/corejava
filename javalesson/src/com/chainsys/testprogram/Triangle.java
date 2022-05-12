package com.chainsys.testprogram;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countA=0;
		for (countA=1;countA<=9;countA++) {
			if (countA < 10) {
				for (int countB= 9; countB>countA;countB--) {
					System.out.print(".");
				}
				for (int countC=countA; countC >= 1; countC--) {
					System.out.print(countC);
				}
				for (int countC=2; countC<=countA; countC++) {
					System.out.print(countC);
				}

	System.out.println();

}}}}
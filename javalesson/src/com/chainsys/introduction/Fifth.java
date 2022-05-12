package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {

		// printNumbersOneToTen();
		// printNumbersTenToOne();
		// printMatrix();
		// printTriangle();
		// printTriangleB();
		//printTriangleC();
		//evenNumber();
		diamondPattern();
	}

	public static void printNumbersOneToTen() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.println(count + "");
		}

	}

	public static void printNumbersTenToOne() {
		int count = 0;
		for (count = 10; count > 10; count--) {
			System.out.println(count + "");
		}
	}

	public static void printMatrix() {
		int countA = 0;
		for (countA = 1; countA <= 5; countA++) {
			for (int countB = 1; countB <= 5; countB++) {

				System.out.println(countB + "");
			}
			System.out.println();
		}
	}

	public static void printTriangle() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {

				System.out.println(countB + "");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 8; countA++) {
			for (int countB = 1; countB < countA; countB++) {

				System.out.print("");
			}
			for (int countC = countA; countC >= 1; countC--) {

				System.out.print(countC);
			}
			System.out.println();
		}
	}

	public static void printTriangleC() {
		int countA=0;
		for (countA=1;countA<=9;countA++) {
			if (countA < 6) {
				for (int countB= 5; countB>= countA;countB--) {
					System.out.print(" ");
				}
				for (int countC=countA; countC >= 1; countC--) {
					System.out.print(countC);
				}
				for (int countC=2; countC<=countA; countC++) {
					System.out.print(countC);
				}

			} 
			else {
				for (int count=0; count<=countA-5; countA++) {

					System.out.print(" ");
				}
				for (int i = 10 - countA; i >= 1; i--) {
					System.out.print(i);
				}
				for (int j = 2; j <= 10 - countA; j++) {
					System.out.print(j);
				}

			}
			System.out.println(" ");
		}}
		
		public static void evenNumber() {
			int n=100;
		
			for (int i = 1; i <= n; i++) {
				  
				   if (i % 2 == 0) {
					System.out.print(i + " ");
				   }
				   System.out.println();
				   
		}
		
		}
		public static void diamondPattern() {

			int i, j, k, l;

			for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 5 - i; j++) {
			System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
			System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
			System.out.print(l);
			}
			System.out.println();
			}
			// bottom diamond pattern
			for (i = 4; i >= 1; i--) {

			for (j = 0; j <= 4 - i; j++) {
			System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
			System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
			System.out.print(l);
			}

			System.out.println();
			}
		}
}
	

package com.chainsys.testprogram;

public class Firsttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100,i;
		for(i=1;i<=n;i++) 
		{
			if(i%3==0&&i%5==0) {
				System.out.print("FizzBuzz");
				
			}
			else if(i%3==0)
			{
				System.out.print("Fizz");
			}
			else if(i%5==0) {
				System.out.print("Buzz");
			}
			
			else {
	
				System.out.print(i);
			}
			System.out.print(" "+" ");
				
		}

	}

}

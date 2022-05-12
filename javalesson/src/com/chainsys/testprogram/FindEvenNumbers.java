package com.chainsys.testprogram;

public class FindEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1546903;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				System.out.println("Given Even Number is:"+rem);
				
			}
			num=num/10;
		}
	}
		

}

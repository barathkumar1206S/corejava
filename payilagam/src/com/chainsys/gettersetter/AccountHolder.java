package com.chainsys.gettersetter;

public class AccountHolder extends Bank{

	public static void main(String[] args) {
		Bank bb=new Bank();
		int s1=bb.getMinimumumBalance();
		System.out.println(s1);
		String s2=bb.getName();
		System.out.println(s2);
	}

}

package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class BankTester {
	public static void testDeposit() {
		System.out.println("Before Balance " + Bank.currentBalance);
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentBalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Barath", 1234565432);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}

}

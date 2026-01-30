package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		
//		a.balance += 100000;
//		System.out.println(a.balance);
		a.deposit(10000);
//		
//		a.balance -= 50000;
//		System.out.println(a.balance);
		a.withdraw(10000);
//		
//		a.balance -= 1000000000;
//		System.out.println(a.balance);
		a.displayBalance();
		
		
	}
}

package com.services;

import com.databases.Account;
import com.databases.AccountDate;

public class AccountService {
	Account acc;
	AccountDate AD;
	
	public void accOpen(String accType, float amount,AccountDate AD) {
		acc = new Account(13144,accType,amount,AD);
		System.out.println("Account Open Successfully Total Balance "+ acc.getAccBal());
	}
	
	public void deposit(int accNo, float amount) {
		if(acc.getAccNo()==accNo) {
			acc.setAccBal(acc.getAccBal()+amount);
			System.out.println(amount+"rs. Amount Credited Successfully Total Balance Is "+acc.getAccBal());
		}else {
			System.out.println("Invalid Account!!! Please Try Again.....");
		}
	}
	
	public void withdraw(int accNo, int amount) {
		if(acc.getAccNo()==accNo) {
			acc.setAccBal(acc.getAccBal()-amount);
			System.out.println(amount+"rs. Amount Debited Successfully Total Balance Is "+acc.getAccBal());
		}
	}
	
	public String toString() {
		return ("Account Details....\n"+"Account Number : "+acc.getAccNo()+"\nAccount Type : "+acc.getAccType()+"\nAccount Balance : "+acc.getAccBal());
	}
	
	public void enquire(int accNo) {
		if(acc.getAccNo() == accNo ) {
			System.out.println("your Account Balance is "+ acc.getAccBal());
		}
	}
	
	public void details() {
		System.out.println("\nAccount Details Are......\n"+"Account Number : "+acc.getAccNo()+"\n"+"Account Type : "+acc.getAccType()+"\n"+"Account Balance : "+acc.getAccBal());
	}
}

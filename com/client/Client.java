package com.client;

import com.databases.Account;
import com.databases.AccountDate;
import com.services.AccountService;

public class Client {
	AccountService accService;
	Account acc;
	public static void main(String args[]) {
		AccountService p1 = new AccountService();
		p1.accOpen("saving", 1000,new AccountDate(10,07,2002));
//		p1.deposit(13144, 9000);
//		p1.withdraw(13144, 100);
		System.out.println(p1);
	}
}

package com.suren.client;

import com.suren.dao.Account1Dao;
import com.suren.dao.AccountDaoImpl;
import com.suren.pojo.Account1;

public class Test {
	public static void main(String[] args) {
		
		Account1Dao  accdao = new AccountDaoImpl();
		System.out.println("Testing of creating account ");
		
		// create a Account object
		Account1 acc = new Account1();
		
		acc.setName("rani");
		acc.setBalance(99999);
	
		int id = accdao.createAccount(acc);
		
		if(id>0) {
			System.out.println("user account created with Accnum :"+id);
		}else {
			System.out.println("User account not created");
			
		}
		System.out.println("=====================");
		
		System.out.println("Testing updateAccountHoldername");
		accdao.updateAccountHolderName(1002, "rani");
		
		System.out.println("=============");
		System.out.println("Testing of deletionAccount(1003)");
		
		Account1 account = accdao.searchAccount(1001);
		if(account !=null) {
			System.out.println(account);
		}else {
			System.out.println("account not found");
		}
	}

}

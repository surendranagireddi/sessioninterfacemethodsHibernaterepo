package com.suren.dao;

import com.suren.pojo.Account1;

public interface Account1Dao {
	public int createAccount(Account1 acc);
	public void updateAccountHolderName(int accNum,String newName);
	public void deleteAccount(int accNum);
	public Account1 searchAccount(int accNum);
	
	

}

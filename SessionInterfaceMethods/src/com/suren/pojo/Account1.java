package com.suren.pojo;

public class Account1 {
	
	private int accNum;
	private String name;
	private double balance;
	@Override
	public String toString() {
		return "Account1 [accNum=" + accNum + ", name=" + name + ", balance=" + balance + "]";
	}
	public Account1() {
	
	}
	public Account1(int accNum, String name, double balance) {
	
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}

package com.capgemini.files.model;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private int accountID;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	private DebitCard debitcard;

	public BankAccount() {
		super();
	}

	public BankAccount(int accountID, String accountHolderName, String accountType, double accountBalance,
			DebitCard deitCard) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.debitcard = deitCard;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public DebitCard getDeitCard() {
		return debitcard;
	}

	public void setDeitCard(DebitCard deitCard) {
		this.debitcard = deitCard;
	}
    @Override
	 public String toString() {
		return  (accountHolderName+" "+accountHolderName+" "+accountType+" "+accountBalance+" "+debitcard);
		 
	 }
}

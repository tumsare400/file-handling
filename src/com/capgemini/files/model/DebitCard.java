package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard {
	private long cardnumber;
	private int cvv;
	private int expirymonth;
	private int expiryYear;

	public DebitCard() {
		super();
		
	}

	public DebitCard(long cardnumber, int cvv, int expirymonth, int expiryYear) {
		super();
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.expirymonth = expirymonth;
		this.expiryYear = expiryYear;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(int expirymonth) {
		this.expirymonth = expirymonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

}

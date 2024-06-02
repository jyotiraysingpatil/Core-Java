package com.app.banking;

public enum AcType {

	SAVINGS(10000), CURRENT(5000), FD(50000), 
	LOAN(25000), DMAT(40000), NRE(150000);

	private double minBalance;

	private AcType(double minBalance) {
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
	
}

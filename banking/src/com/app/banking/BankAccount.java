package com.app.banking;

import java.time.LocalDate;

import com.app.cutomException.BankException;

public class BankAccount {
    private int acctNo;
	private String firstName;
	private String lastName;
	private AcType acType;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;
	

	
	public BankAccount(int acctNo, String firstName, String lastName, AcType acType, LocalDate dob,
			LocalDate creationDate, double balance) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acType = acType;
		this.dob = dob;
		this.creationDate = creationDate;
		this.balance = balance;
		
	}
	
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public AcType getAcType() {
		return acType;
	}
	public void setAcType(AcType acType) {
		this.acType = acType;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}
	
	
	
	public double deposit(double amount) throws BankException {
		balance=balance-amount;
		return balance;
		
	}
	
	public double withdraw(double amount) throws BankException  {
		balance=balance+amount;
		return balance;
	}
	
	public void transferfunds(BankAccount desc,double Amount)throws BankException {
		this.withdraw(Amount);
		desc.deposit(Amount);			
	}
	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
}

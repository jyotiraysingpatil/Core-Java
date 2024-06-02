package com.app.cutomException;

@SuppressWarnings("serial")
public class BankException extends Exception {
	public BankException(String msg) {
		super(msg);
	}
}

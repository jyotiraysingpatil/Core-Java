package com.app.utils;

import com.app.banking.BankAccount;
import com.app.cutomException.BankException;

public class BankUtils {

	public static BankAccount findAccountDetailsByAccountNo(int acctNo,BankAccount[] accts) throws BankException{
		BankAccount acct=new BankAccount(acctNo);
		for(BankAccount b:accts)
			if(b!=null && b.equals(acct))
				return b;
	
	throw new BankException("invalid account No. !!");
}
}
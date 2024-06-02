package com.app.utils;

import java.time.LocalDate;
import com.app.banking.*;
import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.cutomException.BankException;

public class BankValidation {
 
	public static BankAccount validateInputs (int acctNo,String firstName,String lastName, String acType, String dob,
			String creationDate, double balance )throws BankException{
		AcType type=validateAcctType(acType);
		LocalDate birthdate=parseDob(dob);
		LocalDate creDate=parseCreation(creationDate);
		validateBalance(type,balance);
		return new BankAccount(acctNo,firstName,lastName,type,birthdate,creDate,balance);
	}
	
	public static void validateBalance(AcType acType,double balance)throws BankException{ 
		if(balance < acType.getMinBalance() ) 
			throw new BankException("insufficient balance ");
		System.out.println("valid balance");
		
	
	}
	
	public static LocalDate parseDob(String date) {
		return LocalDate.parse(date);
	}
	
	public static LocalDate parseCreation(String date) {
		return LocalDate.parse(date);
	}
	public static AcType validateAcctType(String acType) {
		return AcType.valueOf(acType.toUpperCase());
	}
	
	
}

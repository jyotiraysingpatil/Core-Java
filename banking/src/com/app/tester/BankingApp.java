package com.app.tester;

import static com.app.utils.BankValidation.validateInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.banking.BankAccount;

public class BankingApp {

	public static void main (String[] args)
	{
		List<BankAccount> acct=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in)){
			 boolean exit=false;
			System.out.println("enter max number of account no.: ");
			BankAccount account=new BankAccount();
			int counter=0;
			while(!exit) {
				System.out.println("Options:  1.Create account   2.Display all accounts  3.withrow amount   4.deposit amount  5.transfer funds  6.remove account");
			    System.out.println("enter choice: ");
	             switch(sc.nextInt()) {
	             case 1:
	            	 
	            		 System.out.println("Enter Account details:  acctNo,  firstName,  lastName,  acType,   dob,  creationDate,   balance ");
	            	 BankAccount acc=validateInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
	            	acct.add(acc);
	            	 System.out.println("account created ");
	            	 
	            	 break;
	             case 2:
	            	 for(BankAccount b:acct) {
	            		 System.out.println("the bankdetails are: "+acct);
	            	 }
	            	 break;
	             case 3:
	            	System.out.println("enter the amount "); 
	            	double amount=sc.nextDouble();
	             double amt=account.withdraw(amount);
	                System.out.println("balnce after withraw: "+amt); 
	             break;
	             
	             case 4:
	            	 System.out.println("enter the amount "); 
		            	double amount1=sc.nextDouble();
	            	double amt1=account.deposit(amount1);
	            	System.out.println("balance after deposit"+amt1);
	             	break;
	             	
	             case 5:
	            	 
	            
	             		
		}
	}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
}
}


package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.utils.CMSValidations;

public class CMSApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = new ArrayList<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1. Customer Sign Up 2.Sign in  3.Update Password  4.Display all 0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CMSValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						break;

					case 2://sign in
						System.out.println("Sign In - Enter email and password:");
                        System.out.print("Email: ");
                        String email=sc.next();
                       System.out.print("Password: ");
                        String password=sc.next();
                        
					case 3: //update password
						System.out.println("Enter email");
						String email1=sc.next();
						System.out.println("Enter oldpassword");
						String Password=sc.next();
						System.out.println("Enter newPassword");
						String newPassword=sc.next();
						CMSValidations.changepassword(email1, Password, newPassword, customerList);
						
					case 4:
						System.out.println("Customer details:");
						for (Customer customer1:customerList) {
				          System.out.println(customer1);}
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}
			}
		}

	}

}

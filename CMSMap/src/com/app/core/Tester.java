package com.app.core;

import java.util.ArrayList;

import java.util.Scanner;
import java.util
import com.app.utils.*;

public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			Map<String,Customer> customerList = new HashMap<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1.Register new Customer  2.Sign in   3.Update password   4.Display all   0. Exit");
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
                    
					case 2:
						
}

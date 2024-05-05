package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import com.app.core.*;
import com.app.utils.*;
import com.app.Enum.*;
import com.app.Exception.*;
public class CMSValidation {
	//add a method to check for dup customer (by email)
		public static void checkForDupCustomer(String email, Map<String,Customer> customerList) throws CustomerException{
			// 1. create customer class instance wrapping PK
			Customer newCust = new Customer(email);// a3@gmail.com
			// invoke contains using the customer ref.
	//List : {c1,c2,c3,c4,c5.....} with emails : a1@gmail.com ....a5@gmail.com
			if (customerList.containsKey(newCust))
				throw new CustomerException("Dup Email !!!!");
		}

		// add a method to parse n validate plan n it's charges
		public static ServicePlan parseAndValidatePlanAndCharges(String plan, double regAmount) throws CustomerException {
	//1. parse string(plan) -- > enum
			 ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());
			// => plan is valid , now chk if reg amount is correct
			if (servicePlan.getPlanCost() == regAmount)
				return servicePlan;
			// => incorrect reg amount : throw custom exc
			throw new CustomerException("Reg amount doesn't match with the chose plan cost");

		}

		// add a method to validate all i/ps
		public static Customer validateCustomerInputs(String firstName, String lastName, String email, String password,
				double regAmount, String dob, String plan, Map<String,Customer> customers) throws CustomerException {
			// 1 . check for dup
			checkForDupCustomer(email, customers);
			ServicePlan servicePlan = parseAndValidatePlanAndCharges
					(plan, regAmount);
			LocalDate bithDate = LocalDate.parse(dob);	
			// => all i/ps are valid , ret validated customer details to the caller

			return new Customer(firstName, lastName, 
					email, password, regAmount, bithDate, servicePlan);
		}
		
		public static Customer signin(String email,String password,Map<String,Customer> customer) throws CustomerException{
			Customer newCustomer = new Customer(email);
			int index = customer.valueOf(newCustomer); // O(n)
			if (index == -1)
			    throw new CustomerException("invalid email, login failed");

			Customer customer = customer.get(index); // O(1)
			if (customer.getPassword().equals(password))
			    return customer;
			else
			    throw new CustomerException ("invalid password, login failed");
		}
		
		public static Customer changepassword(String email,String newPassword,Map<String,Customer> customers) throws CustomerException{
			for(Customer customer:customer) {
				if(customer.getEmail().contains(email)) {
					//if(customer.getPassword().contains(Password)) {
						customer.setPassword(newPassword);
						System.out.println("Password updated successfully");
						return customer;
					}
				}
			throw new CustomerException ("Invalid email or password");
		}
		
		public static String deleteCustomerDetails(String email,Map<String,Customer>customer) throws CustomerException {
			//removal by pk->yes,remove(index) or remove(object)
			int index=((String) customer).indexOf(new Customer(email));
			if(index==-1)
				throw new CustomerException("can't subscribe--invalid email");
			//->valid email
			return "Removed details of"+customer.remove(index).getFirstName();
		}
		
		public static void regex(String Password) throws CustomerException{
			String regEx="((?=.*\\\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
			if(!Password.matches(regEx))
			throw new CustomerException ("password is matched");
		}
		
		public static String validateage(String dob) throws CustomerException {
			LocalDate birthDate = LocalDate.parse(dob);
		 String age=Period.between(birthDate,LocalDate.now()).getYears();
		 if(age > 21)
			 throw new CustomerException("invalid age");
		 return age;
		}}



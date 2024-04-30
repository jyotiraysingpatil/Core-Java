package com.app.validation;

import com.app.tester.Customer;

public class CustomerValidation {

    public static void checkForDup(String email, Customer[] customers) throws CustomerException {
        for (Customer customer : customers) {
            if (customer != null && customer.getEmail().equals(email)) {
                throw new CustomerException("Email already registered");
            }
        }
    }
    
    public static void signin(String email, String password, Customer[] customers) throws CustomerException {
       boolean found = false; // Initialize found to false
        for (Customer customer : customers) {
            if (customer != null && customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                found = true;
            }
                else {
                    throw new CustomerException("Invalid email or password");
            }
        }
       
        }
    }


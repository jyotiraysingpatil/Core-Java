package com.app.tester;
import java.util.Scanner;
import com.app.validation.*;

public class CustomerApp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean exit = false;
            System.out.println("Enter max no of Customer");
            Customer[] c = new Customer[sc.nextInt()];
            int counter = 0;
            while (!exit) {
                System.out.println("Options : 1.Sign up (customer registration)   2.Sign in (login)   3.Change password   4. Unsubscribe customer   5.Display all customers   0.Exit");
                System.out.println("Choose an option");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        if (counter < c.length) {
                        	System.out.println("Enter First Name :");
                        	String fname=sc.next();
                        	System.out.println("Enter last Name: ");
                        	String lname=sc.next();
                        	System.out.println("Enter email id: ");
                        	String email=sc.next();
                        	System.out.println("Enter Password: ");
                        	String password=sc.next();
                        	System.out.println("Enter Registrationamount: ");
                        	double ramt=sc.nextDouble();
                        	System.out.println("Enter Date: ");
                        	String dob=sc.next();
                        	System.out.println("Enter ServicePlan: ");
                        	String splan=sc.next();
                            System.out.println("Customer Signed Up");
                 
                            counter++;
                        } else {
                            System.out.println("Maximum customers reached.");
                        }
                        break;
                    case 2:
                    	System.out.println("Sign In - Enter email and password:");
                        System.out.print("Email: ");
                        String email=sc.next();
                       System.out.print("Password: ");
                        String password=sc.next();
                          CustomerValidation.signin(email,password,c);
                        
                        System.out.println("Successful logined");
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                       
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
            	
            }catch(Exception e){
            	System.out.println(e);
        }
    }
}

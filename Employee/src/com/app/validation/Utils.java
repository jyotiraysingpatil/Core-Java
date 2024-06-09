package com.app.validation;

import static com.app.validation.ValidateInputs.validateDateOfJoining;
import static com.app.validation.ValidateInputs.validateEmpType;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.app.core.EmpType;
import com.app.core.Employee;
import com.app.custome_exception.EmployeeException;

public class Utils {
//add fulltime and parttime employee
	    public static Employee addFullTimeEmployee(String name, String dateOfJoining, String phoneNumber, String aadhaarNumber,
	    	String empType, double salary) throws EmployeeException {
	        LocalDate date =validateDateOfJoining(dateOfJoining);
	        EmpType Type = validateEmpType(empType,salary);
	       return new Employee(name,date,phoneNumber,aadhaarNumber,Type,salary);
	    }
	    
	//delete employee using empId
	    public static void deleteEmployeeDetails(int empId,List<Employee> empList) throws EmployeeException{
	    	 Iterator<Employee> itr= empList.iterator();
	    	 while(itr.hasNext()) {
	    		 Employee e=itr.next();
	    		 if(e.getEmpId()==empId) {
	    			 itr.remove();
	    			 System.out.println(e);
	    		 }
	    	 }
	    }
	   
	    //search emp details by aadhar no.
	    public static void searchEmpDetails(String aadhaarNumber,List<Employee> empList) throws EmployeeException{
	    	Iterator<Employee> itr=empList.iterator();
	    	while(itr.hasNext()) {
	    		Employee e=itr.next();
	    		if(e.getAadhaarNumber().equals(aadhaarNumber)) {
	    			System.out.println(e);
	    		}
	    	}
	    }
	    
	    
	}
	
	 


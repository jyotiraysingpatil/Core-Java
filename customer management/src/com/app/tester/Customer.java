package com.app.tester;

import java.time.LocalDate;

import com.app.Enum.Splan;

public class Customer {
private int cid;
private String fname;
private String lname;
private String email;
private String password;
private double ramt;
private LocalDate dob;
private Splan sp;

public Customer(int cid,String fname,String lname,String email,String password,double ramt,LocalDate dob,Splan sp) {
	this.cid=cid;
	this.fname=fname;
	this.lname=lname;
	this.email=email;
	this.password=password;
	this.ramt=ramt;
	this.dob=dob;
	this.sp=sp;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
			+ password + ", ramt=" + ramt + ", dob=" + dob + ", sp=" + sp + "]";
}

public String getEmail() {
	return email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}





}

package com.app.utils;

import java.time.LocalDate;
import java.time.LocalTime;

import com.app.core.Hospital;
import com.app.core.Specialization;
import com.app.core.TimeSlot;
import com.app.custome_exception.HospitalException;


public class Validation {
 public static Hospital addNewAppointment( String email, String name, String appodate, String slot, String dName,
		 String specialization)throws HospitalException{
	 Specialization type=validateSpecialization(specialization);
	 LocalDate appDate=validateappoDate(appodate);
	TimeSlot tslot=validateTimeSlot(slot);
	 return new Hospital(email,name,appDate,tslot,dName,type);
 }
	
	public static LocalDate validateappoDate(String appodate) {
		return LocalDate.parse(appodate);
	}
	
	public static Specialization validateSpecialization(String specialization) throws HospitalException{
		Specialization Type=Specialization.valueOf(specialization.toUpperCase());
		return Type;
	}
	
	public static TimeSlot validateTimeSlot(String slot)throws HospitalException{
		TimeSlot time=TimeSlot.valueOf(slot.toUpperCase());
		return time;
	}
	
	
	
}

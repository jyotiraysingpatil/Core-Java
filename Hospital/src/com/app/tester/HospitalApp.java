package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Hospital;
import com.app.core.Specialization;
import com.app.core.TimeSlot;
import com.app.utils.Validation;

public class HospitalApp {

	public static void main(String[] args) {
		List<Hospital> hospitalList=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			int counter=0;
			while(!exit) {
				System.out.println("Choose options:  1.add Appointment  2.display all appointments   3.");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Details : email, name,  appodate,  slot,  dName,  specialization");
				    Hospital hospital=Validation.addNewAppointment(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),sc.next());
				 hospitalList.add(hospital);
			System.out.println("Apponitment Successfully added");
				break;
			
				
				
				
				
			}
			
			
			
			
			
			
		}

	
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}


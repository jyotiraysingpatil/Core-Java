package com.app.core;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Hospital {
private static int idCounter = 1;
private int id;
private String email;
private String name;
private LocalDate appodate;
private TimeSlot slot;
private String dName;
private Specialization specialization;
@Override
public int hashCode() {
	return Objects.hash(appodate, dName, email, id, name, slot, specialization);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hospital other = (Hospital) obj;
	return Objects.equals(appodate, other.appodate) && Objects.equals(dName, other.dName)
			&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
			&& Objects.equals(slot, other.slot) && specialization == other.specialization;
}






public Hospital(String email, String name, LocalDate appodate, TimeSlot slot, String dName,
		Specialization specialization) {
	super();
	this.email = email;
	this.name = name;
	this.appodate = appodate;
	this.slot = slot;
	this.dName = dName;
	this.specialization = specialization;
}
public static int getIdCounter() {
	return idCounter;
}
public static void setIdCounter(int idCounter) {
	Hospital.idCounter = idCounter;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getAppodate() {
	return appodate;
}
public void setAppodate(LocalDate appodate) {
	this.appodate = appodate;
}
public TimeSlot getSlot() {
	return slot;
}
public void setSlot(TimeSlot slot) {
	this.slot = slot;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public Specialization getSpecialization() {
	return specialization;
}
public void setSpecialization(Specialization specialization) {
	this.specialization = specialization;
}



}

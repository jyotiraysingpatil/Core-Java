package com.app.core;

public enum TimeSlot {
morningslot(8-1),eveningslot(6-9);
	
private int timeSlot;



private TimeSlot(int timeSlot) {
	this.timeSlot = timeSlot;
}



public int getTimeSlot() {
	return timeSlot;
}





}

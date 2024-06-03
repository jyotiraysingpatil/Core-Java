package com.app.core;

import java.time.LocalDate;
import com.app.core.*;
public class Task {
	
private static int idCounter=1;
private int taskId;
private String taskName;
private String description;
private LocalDate taskDate;
private Status status;
private boolean active;
public static int getIdCounter() {
	return idCounter;
}


public Task(int taskId) {
	super();
	this.taskId = taskId;
}


public static void setIdCounter(int idCounter) {
	Task.idCounter = idCounter;
}
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getTaskDate() {
	return taskDate;
}
public void setTaskDate(LocalDate taskDate) {
	this.taskDate = taskDate;
}

public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}

public Status getStatus() {
	return status;
}


public void setStatus(String type) {
	this.status = type;
}


public Task( String taskName, String description, LocalDate taskDate, Status status, boolean active) {
	super();
	
	this.taskName = taskName;
	this.description = description;
	this.taskDate = taskDate;
	this.status = status;
	this.active = active;
}
@Override
public String toString() {
	return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
			+ taskDate + ", active=" + active + "]";
}


public Task(int taskId, Status status) {
	super();
	this.taskId = taskId;
	this.status = status;
}


}

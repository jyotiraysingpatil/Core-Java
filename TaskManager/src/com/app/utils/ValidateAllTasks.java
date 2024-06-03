package com.app.utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.core.Status;
import com.app.core.Task;
import com.app.custom_Exception.TaskManagerException;

public class ValidateAllTasks {
	Scanner sc=new Scanner(System.in);
//int taskId, String taskName, String description, LocalDate taskDate, Status status, boolean active
	public static Task addNewTask(String taskName, String description, String taskDate, String status, boolean active)throws TaskManagerException{
		Status type=validateStatus(status);
		LocalDate taskdate=validateTaskDate(taskDate);
		return new Task(taskName,description,taskdate,type,active);
	}
	
	public static LocalDate validateTaskDate(String taskDate) {
		return LocalDate.parse(taskDate);
	}
	
	public static Status validateStatus(String status) throws TaskManagerException{
		Status Type=Status.valueOf(status.toUpperCase());
		return Type;
	}
	
	public static String updateTaskStatus(int taskId,String Type,List<Task> taskList) throws TaskManagerException{
		Task t=new Task(taskId);
		int index=taskList.indexOf(t);
			if(index== -1) {
				System.out.println("Task not updated !!");
			t.setStatus(Type);
				return ("Task Status is Updated successfully !!");
				
			}
		}
	}
	


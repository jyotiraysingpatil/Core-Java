package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Task;
import com.app.utils.ValidateAllTasks;

public class TaskManagerApp {
	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		boolean exit=false;
		List<Task> taskList=new ArrayList<>();
		while (!exit) {
			System.out.println("Options :1.Add new Task  2.Display all Tasks  3.Delete a task  4.Update a Task  5.Display all Pending Tasks  "
					+ "5.Display all pending tasks for today  6.Display all tasks sorted by taskDate");
		
			System.out.println("Choose");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter details: taskName, description, taskDate, status, active");
					Task task=ValidateAllTasks.addNewTask(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextBoolean());
					taskList.add(task);
					System.out.println("Task added successfully !!! ");
					break;
				
				case 2:
					for(Task t:taskList)
					{
						System.out.println("here is all tasks :"+taskList);
					}
				break;
				case 3:
					System.out.println("enter your id and Status");
					ValidateAllTasks.updateTaskStatus(sc.nextInt(),sc.next(), taskList);
					break;
				
				
				
				}
				}catch(Exception e) {
					e.printStackTrace();
			}
			}
	}
}
}
package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Cricket;
import com.app.utils.Validation;
import static com.app.utils.Validation.*;
public class CricketerTest {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
		Validation v=new Validation();
			List<Cricket> cricketList=new ArrayList<>();
			while(!exit) {
				System.out.println("Choose options: 1.Add player Details  2.Modify Cricketer's rating "
						+ "3.Search Cricketer by name  4.Display all Cricketers added in collection  "
						+ "5.Display All Cricketers in sorted form by rating");
			System.out.println("Choose");
			try{
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter details:  name,  age,  email,  phoneNo,  rating");
					Cricket cricket=Validation.addCricketerDetails(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
					cricketList.add(cricket);
					System.out.println("Details Successfully added!!!");
					break;
				case 2:
					for(Cricket c:cricketList)
					{
						System.out.println(c);
					}
					break;
				case 3:
					System.out.println("Enter name and newRating : ");
					v.modifyRating(sc.next(),sc.nextInt(), cricketList);
					System.out.println("Rating Modified Successfully"+cricketList);
					break;
				case 4:
					System.out.println("Enter Name of the player to search: 4");
					v.searchCricketerByName(sc.next(), cricketList);
					break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
				
			}
		}

	}

}

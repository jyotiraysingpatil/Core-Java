package com.app.utils;

import java.util.Iterator;
import java.util.List;

import com.app.core.Cricket;
import com.app.custom_exception.CricketException;

public class Validation {

	public static Cricket addCricketerDetails (String name, int age, String email, String phoneNo, int rating)throws CricketException{
		return new Cricket(name,age,email,phoneNo,rating);
	}
	

	public void modifyRating(String name, int newRating,List<Cricket> cricketList) {
        for (Cricket cricketer : cricketList) {
            if (cricketer.getName().equalsIgnoreCase(name)) {
                cricketer.setRating(newRating);
               
            }
        }
    }

	public Cricket searchCricketerByName(String name,List<Cricket> cricketList) throws CricketException{
		Iterator <Cricket> itr=cricketList.iterator();
		while(itr.hasNext()) {
			Cricket c=itr.next();
			if(c.getName().equals(name)) {
				return c;
			}		
		}
		return null;
}
}
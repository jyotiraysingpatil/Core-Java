package com.app.utils;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.custom_exception.PenException;
import com.app.pen.Brand;
import com.app.pen.PenStock;

public class PenUtils {
 Scanner in=new Scanner(System.in);
	public static PenStock addNewPenStock(String brand, String color, String inkColor, String material, int stock,
			String stockUpdateDate, String stockListingDate, double price, double discount) throws PenException{
		Brand type=validateBrand(brand);
		LocalDate stockupdate=validatestockUpdateDate(stockUpdateDate);
		LocalDate stocklistdate=validatestockListingDate(stockListingDate);
		return new PenStock(type,color,inkColor,material,stock,stockupdate,stocklistdate,price,discount);
	}
	
	
	public static LocalDate validatestockUpdateDate(String stockUpdateDate) {
		return LocalDate.parse(stockUpdateDate);
	}
	
	public static LocalDate validatestockListingDate(String stockListingDate) {
		return LocalDate.parse(stockListingDate);
	}
	
	public static Brand validateBrand(String brand) throws PenException{
	Brand Type =Brand.valueOf(brand.toUpperCase());
	return Type;	
	}
	
	public static String updatePenStock(int id,List<PenStock> penStocks) throws PenException{
	    PenStock p=new PenStock(id);
	    int index=penStocks.indexOf(p);
	    if(index== -1)
	    	throw new PenException("You will not updated");
	    p.setStock(100);
	    p.setStockUpdateDate(LocalDate.now());
	   
	    throw new PenException("Pen with ID " + id + " Succesfully Updated");
}
	
	public static List<PenStock> setDiscountForOldPens(List<PenStock> penstock) throws PenException {
        LocalDate currentDate =  LocalDate.now();
      LocalDate threeMonthAgo=currentDate.minusMonths(3);
	for(PenStock p: penstock){
		if(p.getStockListingDate().isBefore(threeMonthAgo)) {
			double price=p.getPrice();
			double discount=p.getDiscount();
			p.setPrice(price);
		}
	}
	return penstock;
	}   
	
	public static String removePens(List<PenStock> penStock) throws PenException {
		LocalDate currentDate=LocalDate.now();
		LocalDate nineMonthAgo=currentDate.minusMonths(9);
		Iterator<PenStock> itr=penStock.iterator();
		while(itr.hasNext()) {
			PenStock p=itr.next();
			if(p.getStockListingDate().isBefore(nineMonthAgo)) {
				itr.remove();
			}
		}
		return "Pens removed successfully";
		
	}
	        
}        
	

	
	

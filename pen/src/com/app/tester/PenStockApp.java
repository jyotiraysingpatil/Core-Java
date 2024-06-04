package com.app.tester;

import static com.app.utils.PenUtils.addNewPenStock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.pen.PenStock;
import com.app.utils.PenUtils;

public class PenStockApp {

	public static void main(String[] args) {
		List<PenStock> penstock=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in)){
		
		boolean exit=false;
		//PenStock pen=new PenStock(id);
		int counter=0;
		while(!exit) {
		System.out.println("Options:  1.Add new Pen  2.Update Stock of Pen   3.Set discount of 20% for all the pens which are not at all sold in last 3 months   "
				+ "4.Remove Pens never sold once in 9 months");
		  System.out.println("enter choice: ");
          switch(sc.nextInt()) {
          case 1:
        	 
        	  System.out.println("Enter new Pen:  brand,  color,   inkColor,  material,  stock , stockUpdateDate,  stockListingDate,  price,  discount");
        	  PenStock p=addNewPenStock(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
        	  penstock.add(p);
         System.out.println("Product added in the stock!!!");
         break;
          case 2:
        	  System.out.println("Enter the id : ");
        	  PenUtils.updatePenStock(sc.nextInt(),penstock);
        	 break;
        	 
          case 3:System.out.println("Discount add list is : ");
        	  PenUtils.setDiscountForOldPens(penstock);
        	  break;
        	  
          case 4:
        	  System.out.println("Remove pens from list :");
        	PenUtils.removePens(penstock);
        	break;
          }
          
	}

}catch(Exception e) {
	e.printStackTrace();
}
}
}
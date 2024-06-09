import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of the array: ");
	  int size=sc.nextInt();
	  List<Integer> arrayList=new ArrayList<>();
	  System.out.println("Enter the elements of the array: ");
	  for(int i=0;i<size;i++) {
		  arrayList.add(sc.nextInt());		  
	  }
	  
	  Map<Integer,Integer> o=new HashMap<>();
	  for(int num:arrayList) {
		  if(o.containsKey(num)) {
			  o.put(num,o.get(num)+1);			  
		  }
		  else {
			  o.put(num, 1);
		  }
	  }
	  System.out.println("Occurrence of elements in array: ");
	  for(Map.Entry<Integer,Integer>entry: o.entrySet()) {
		  System.out.println(entry.getKey()+":"+entry.getValue());
	  }
	  
	  
	  
	  }
}
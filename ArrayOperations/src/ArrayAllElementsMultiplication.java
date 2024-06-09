import java.util.Scanner;

public class ArrayAllElementsMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements in the array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
      System.out.println("Enter the elements of array: ");
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
  	  
      }
      
      int mult=1;
      for(int i=0;i<n;i++) {
    	  mult*=arr[i];
      }
      System.out.println("multiplication all elements is: "+mult);
	}

}

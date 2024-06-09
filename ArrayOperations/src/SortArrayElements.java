import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
		}
		//for ascending sort
		Arrays.sort(arr);
		
		System.out.println("The sorted elements in ascending order are : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
	}

}

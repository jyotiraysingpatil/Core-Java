import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestAndLowestElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter elements of array : ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	if(n<2) {
		System.out.println("array does not have enough elements ");		
	}
	else {
		Arrays.sort(arr);
		int secondLowest=arr[1];
		int secondHighest=arr[n-2];
		System.out.println("second Lowest element "+secondLowest);
		System.out.println("second Highest element "+secondHighest);
	}
	}

}

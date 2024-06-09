import java.util.Scanner;

public class EvenAndOddElementsOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements : ");
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Even number: ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"");
			}
		}
		System.out.println("Odd numbers : ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+"");
			}
		}
	}

}

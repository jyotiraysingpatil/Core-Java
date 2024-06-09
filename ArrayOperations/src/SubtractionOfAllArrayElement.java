import java.util.Scanner;

public class SubtractionOfAllArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Elements of Array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
       int sub=1;
       for(int i=1;i<n;i++) {
    	   sub-=arr[i];
       }
       System.out.println("subtraction of element is: "+sub);
	}

}

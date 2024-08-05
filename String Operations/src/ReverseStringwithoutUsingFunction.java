import java.util.Scanner;

public class ReverseStringwithoutUsingFunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String Original= sc.nextLine();
		String reversed=reverseString(Original);
		System.out.println("Original String : "+ Original);
		System.out.println("Reversed String : "+ reversed);
	}

	public static String reverseString(String str) {
		if(str == null || str.isEmpty()) {
			return str;
		}
		char[] chars=str.toCharArray();
		int left=0;
		int right=chars.length-1;
		
		while(left<right) {
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--;
		}
		return new String(chars);
	}	
}

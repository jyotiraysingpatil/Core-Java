import java.util.Scanner;

public class Reverse_String {
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
	return new StringBuilder(str).reverse().toString();
}
}

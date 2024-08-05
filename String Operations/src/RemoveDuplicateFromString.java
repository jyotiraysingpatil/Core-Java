import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String: ");
	    	String Original= sc.nextLine();
	    	String result= removeDuplicates(Original);
	    	System.out.println("Original String : "+Original);
	    	System.out.println("String without duplicates : "+result);

	 }
	 public static String removeDuplicates(String str) {
		 if(str == null || str.isEmpty()) {
			 return str;
		 }
		 StringBuilder result=new StringBuilder();
		 Set<Character> seen= new HashSet<>();
		 for(char ch: str.toCharArray()) {
			 if(!seen.contains(ch)) {
				 seen.add(ch);
				 result.append(ch);
			 }
		 }
		 return result.toString();
	 }
}

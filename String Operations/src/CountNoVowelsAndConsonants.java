import java.util.Scanner;

public class CountNoVowelsAndConsonants {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        
	        int[] counts= countVowelsAndConsonants(input);
	        System.out.println("Number of vowels : "+counts[0]);
	        System.out.println("Number of consonants : "+counts[1]);
 
	 }
	 public static int[] countVowelsAndConsonants(String str) {
		 int vowels=0;
		 int consonants=0;
		 if(str != null && !str.isEmpty()) {
			 str=str.toLowerCase();
			 for(char ch: str.toCharArray()) {
				 if(ch >= 'a' && ch<= 'z') {
					 if(ch== 'a' || ch== 'e'||ch=='i'|| ch=='o'||ch=='u') {
						 vowels++;
					 }else {
						 consonants++;
					 }
				 }
			 }
		 }
		 return new int[] {
			vowels,consonants	 
		 };
		 
	 }
}
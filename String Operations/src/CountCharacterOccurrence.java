import java.util.Scanner;

public class CountCharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char ch = scanner.next().charAt(0);

        int count = countCharacterOccurrence(input, ch);

        System.out.println("The character '" + ch + "' appears " + count + " times.");
    }

    public static int countCharacterOccurrence(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        str = str.trim(); // Remove leading and trailing spaces
        ch = Character.toLowerCase(ch); // Convert the character to lowercase for case-insensitive comparison

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == ch) { // Convert each character to lowercase for case-insensitive comparison
                count++;
            }
        }

        return count;
    }
}

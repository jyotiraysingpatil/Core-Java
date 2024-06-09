import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescendingSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort array in ascending order
        Arrays.sort(arr);
        System.out.println("Array elements in ascending order: " + Arrays.toString(arr));
        
        // Sort array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(arr));
    }
}

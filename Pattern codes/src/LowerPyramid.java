public class LowerPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

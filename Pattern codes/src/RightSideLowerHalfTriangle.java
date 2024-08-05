public class RightSideLowerHalfTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Print two spaces for each leading space
            }
            // Print stars
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

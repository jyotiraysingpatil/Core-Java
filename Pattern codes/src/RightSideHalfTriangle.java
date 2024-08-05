public class RightSideHalfTriangle {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < (rows - i - 1); j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

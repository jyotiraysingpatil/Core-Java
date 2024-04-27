package tester;

import java.util.Scanner;
import validation.Validatecolor;
import validation.ValidatePollutionLevel;
import vehicle.Enum;
import vehicle.Vehicle;

public class Tester {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Pollution level: ");
            double pollutionLevel = in.nextDouble();

            System.out.println("Enter chasisNo Number:");
            int chasisNo = in.nextInt();
            System.out.println("Enter Vehicle Uniqueid:");
            long uniqueid = in.nextLong();
           // Vehicle v = new Vehicle(101, "ps", "RED", 50000, 40000);

            System.out.println("----Menu-----");
            System.out.println("1. pollutionLevel ");
            System.out.println("2. Color ");
            System.out.println("Enter your choice: ");
            int ch = in.nextInt();

            try {
                switch (ch) {
                    case 1:
                        System.out.println("Enter Pollution Level: ");
                        double pollutionInput = in.nextDouble();
                        ValidatePollutionLevel.validatepollutionLevel(pollutionInput);
                        break;
                    case 2:
                        System.out.println("Enter color :");
                        String colorInput = in.next();
                        Validatecolor.validatecolor(Enum.valueOf(colorInput.toUpperCase()));
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Vehicle is tested ");
            }
        }
    }
}

import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab5Q3 {
    public static void main(String[] args) {

        // Create Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Declare constants for fixed values
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        // Input the start date
        System.out.print("Enter start date (1-31): ");
        int startDate = input.nextInt();

        // Input the end date
        System.out.print("Enter end date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: Check whether dates are between 1 and 31
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Date should be between 1 and 31.");
            input.close();
            return;
        }

        // Validation 2: Start date must be less than end date
        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date.");
            input.close();
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Variable to store discount percentage
        double discountRate = 0;

        // Find the discount according to the number of days
        if (numberOfDays < 3) {
            discountRate = 0;
        }
        else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        // Calculate the total room charge before discount
        double totalCharge = numberOfDays * ROOM_CHARGE_PER_DAY;

        // Calculate discount amount
        double discountAmount = totalCharge * discountRate / 100;

        // Calculate final amount after discount
        double totalAmount = totalCharge - discountAmount;

        // Display the results
        System.out.println("Room charge per day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: Rs. " + totalAmount);

        // Close Scanner
        input.close();
    }
}
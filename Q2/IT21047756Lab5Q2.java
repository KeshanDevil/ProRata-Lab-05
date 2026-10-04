import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab5Q2 {
    public static void main(String[] args) {

        // Create Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number of new members
        System.out.print("Enter the number of new members: ");
        int members = input.nextInt();

        // Validate that the number is not negative
        while (members < 0) {
            System.out.println("Invalid number! Number must be 0 or greater.");
            System.out.print("Enter the number of new members again: ");
            members = input.nextInt();
        }

        // Use switch statement to select the prize
        switch (members) {

            case 0:
                System.out.println("Prize: No Prize");
                break;

            case 1:
                System.out.println("Prize: Pen");
                break;

            case 2:
                System.out.println("Prize: Umbrella");
                break;

            case 3:
                System.out.println("Prize: Bag");
                break;

            case 4:
                System.out.println("Prize: Travelling Chair");
                break;

            default:
                // 5 or more members get a Headphone
                System.out.println("Prize: Headphone");
                break;
        }

        // Close the Scanner
        input.close();
    }
}
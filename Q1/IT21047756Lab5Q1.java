
import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab5Q1 {
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input the first integer
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        // Input the second integer
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Input the third integer
        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Display the numbers entered by the user
        System.out.println("User entered numbers are: "
                           + num1 + ", " + num2 + ", " + num3);

        // Assume the first number is the smallest and largest
        int smallest = num1;
        int largest = num1;

        // Check whether the second number is smaller or larger
        if (num2 < smallest) {
            smallest = num2;
        }

        if (num2 > largest) {
            largest = num2;
        }

        // Check whether the third number is smaller or larger
        if (num3 < smallest) {
            smallest = num3;
        }

        if (num3 > largest) {
            largest = num3;
        }

        // Display the smallest and largest numbers
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);

        // Close the Scanner
        input.close();
    }
}
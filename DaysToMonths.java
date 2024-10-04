import java.util.Scanner;

public class DaysToMonths {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of days
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Calculate the number of months and remaining days
        int months = days / 30;
        int remainingDays = days % 30;

        // Output the result
        System.out.println(days + " days is equivalent to " + months + " month(s) and " + remainingDays + " day(s).");
    }
}

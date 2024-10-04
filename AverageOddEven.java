
    import java.util.Scanner;

    public class AverageOddEven {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);
    
            // Ask the user to input the value of N
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();
    
            // Variables to store sum of odd and even numbers
            int oddSum = 0, evenSum = 0;
    
            // Loop to calculate the sum of first N odd and even numbers
            for (int i = 1; i <= N; i++) {
                oddSum += (2 * i - 1);  // Odd numbers: 1, 3, 5, 7, ...
                evenSum += (2 * i);     // Even numbers: 2, 4, 6, 8, ...
            }
    
            // Calculate the averages
            double oddAverage = (double) oddSum / N;
            double evenAverage = (double) evenSum / N;
    
            // Output the results
            System.out.println("Average of first " + N + " odd numbers: " + oddAverage);
            System.out.println("Average of first " + N + " even numbers: " + evenAverage);
    
            //
     
}
}


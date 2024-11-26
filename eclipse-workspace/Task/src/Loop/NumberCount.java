package Loop;

/* 7. loop-Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. */




import java.util.Scanner;

public class NumberCount {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        boolean continueEntering = true;
        
        while (continueEntering) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                
                // Increment counters based on the number
                if (number > 0) {
                    countPositive++;
                } else if (number < 0) {
                    countNegative++;
                } else {
                    countZeros++;
                }
            } else if (scanner.hasNext() && scanner.next().equalsIgnoreCase("stop")) {
                // User wants to stop
                continueEntering = false;
            } else {
                System.out.println("Invalid input. Please enter a number or type 'stop' to finish.");
            }
        }
        
        // Display the counts
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zeros: " + countZeros);
        
        scanner.close();
    }
}

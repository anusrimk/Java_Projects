//WAP to find average of consecutive N Odd numbers and even numbers.

import java.util.Scanner;

public class average_odd_even_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculating the sum of the first N odd numbers
        int sumOdd = 0;
        for (int i = 1; i <= N; i++) {
            int oddNumber = 2 * i - 1;
            sumOdd += oddNumber;
        }
        double averageOdd = (double) sumOdd / N;

        // Calculating the sum of the first N even numbers
        int sumEven = 0;
        for (int i = 1; i <= N; i++) {
            int evenNumber = 2 * i;
            sumEven += evenNumber;
        }
        double averageEven = (double) sumEven / N;

        // Displaying the results
        System.out.println("The average of the first " + N + " odd numbers is: " + averageOdd);
        System.out.println("The average of the first " + N + " even numbers is: " + averageEven);

        scanner.close();
    }
}

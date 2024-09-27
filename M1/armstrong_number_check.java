//WAP to check whether the inputted number is Armstrong Number or not. (Hint:An Armstrong number is a positive m-digit number that is equal to the sum of the mth powersof their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number.153: 13 + 53 + 33 = 1 + 125+ 27 = 153 (An Armstrong Number),125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)Hint: use Math.pow(num1, num2) to calculate power.

import java.util.Scanner;

public class armstrong_number_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

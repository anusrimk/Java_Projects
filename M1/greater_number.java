//WAP to find greater among two numbers using conditional operator.

import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int greater = (num1 > num2) ? num1 : num2;

        System.out.println("The greater number is: " + greater);
        
        scanner.close();
    }
}
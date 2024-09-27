import java.util.Scanner;
public class co_prime_or_not {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        boolean areCoprime = isCoprime(num1, num2);
        if (areCoprime) {
            System.out.println(num1 + " and " + num2 + " are coprime.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not coprime.");
        }
        scanner.close();
    }
    private static boolean isCoprime(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 1;
    }
}
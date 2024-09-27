// import java.util.Scanner;
// public class for_loops{
//     public static void main(){
//         for(int i=0;i<=10;i++){
//             System.out.println(i);
//             i++;
//         }
//     }
// }
import java.util.Scanner;

public class HCFCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF using a for loop
        int hcf = calculateHCF(num1, num2);

        // Display the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner
        scanner.close();
    }
    private static int calculateHCF(int a, int b) {
        int hcf = 1;
        int smaller = (a < b) ? a : b;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i; 
            }
        }

        return hcf;
    }
}

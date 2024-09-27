// // public class ConsecutiveNumbers {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 7, 8, 9, 15, 16, 17, 20, 21, 22, 25, 26, 27, 30, 31, 32, 35, 36};

//         displayConsecutiveNumbers(numbers);
//     }

//     private static void displayConsecutiveNumbers(int[] arr) {
//         System.out.println("Consecutive Numbers:");
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] + 1 == arr[i + 1]) {
//                 System.out.println(arr[i] + ", " + arr[i + 1]);
//             }
//         }
//     }
// }
import java.util.Scanner;
public class FindConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        findConsecutiveNumbers(numbers);
        scanner.close();
    }
    private static void findConsecutiveNumbers(int[] arr) {
        System.out.println("Consecutive Numbers:");

        for (int i = 0; i < arr.length - 1; i++) {
            //if (arr[i] + 1 == arr[i + 1]) {
            if (arr[i]== arr[i + 1]-1) {
                System.out.println(arr[i] + ", " + arr[i + 1]);
            }
        }
    }
}

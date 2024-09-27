// Question 22
package Module_2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        System.out.print("Array is : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the number you want to look for : ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (arr[i] == num) {
                System.out.println(num + " found at index " + i);
                flag = true;
            }
        }

        if(!flag) System.out.println("Sorry! " +num+ " wasn't found in the array.");

        sc.close();
    }
}

// Question 23
package Module_2;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        double average = 0;

        System.out.print("Array is : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        average = sum / arr.length;

        System.out.println("Sum of elements : " +sum);
        System.out.println("Average of elements : " +average);

    }
}

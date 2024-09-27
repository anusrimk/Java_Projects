// Question 24
package Module_2;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements : ");
        for(int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }

        sc.close();
    }
}

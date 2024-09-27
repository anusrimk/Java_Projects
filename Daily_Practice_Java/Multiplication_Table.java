package Daily_Practice_Java;
import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i<=end;i++){
            System.out.println(num + " x "+ i + " = " + num*i);
        }

    sc.close();
    }
}

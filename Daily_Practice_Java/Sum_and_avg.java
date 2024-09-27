package Daily_Practice_Java;
import java.util.Scanner;

public class Sum_and_avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i<=end;i++){
            sum+=i;
        }
        double average = sum / (end - (start-1));
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);
    
    sc.close();
    }
}

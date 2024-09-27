package Daily_Practice_Java;
import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println(num + " is neither even nor odd.");
        }
        else if (num % 2 == 0){
            System.out.println(num + " is even.");
        }
        else{
            System.out.println(num + " is odd.");
        }
    sc.close();
    }
}

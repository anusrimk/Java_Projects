package Daily_Practice_Java;
import java.util.Scanner;

public class Pos_Neg_or_0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println("Number is 0.");
        }
        else if (num > 0){
            System.out.println("Number is Positive.");
        }
        else{
            System.out.println("Number is Negative.");
        }
        
     sc.close();
    }
}

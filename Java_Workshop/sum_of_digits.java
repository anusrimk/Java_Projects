import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int num1 =scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 =scanner.nextInt();

        int sum_of_digits=num1+num2;
        System.out.println(sum_of_digits);
        
        scanner.close();
    }
}

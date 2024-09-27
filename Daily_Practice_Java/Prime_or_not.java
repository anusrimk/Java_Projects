package Daily_Practice_Java;
import java.util.Scanner;

public class Prime_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean flag = true;

        if (num <= 1) {
            flag = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Number is prime");
        } 
        else{
            System.out.println("Number isn't prime");
        }


    sc.close();

    }
}

// constructor overloading
//access specifier
//types of constructor and this keyword
// packages in java
// static and non static methods
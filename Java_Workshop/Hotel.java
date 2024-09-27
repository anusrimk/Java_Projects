import java.util.Scanner;
public class Hotel
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);//constructor
        System.out.println("Enter the number of days: ");
        int days=sc.nextInt();
        if (days<=3){
            int price=days*3750;
            int total= (price/100)*19 + price;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
        else if(days>3 && days<=6){
            int remaining_1=days-3;
            int price= remaining_1 * 3250 +11250;
            int total= (price/100)*19 + price;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
        else if(days>6 && days<=9){
            int remaining_2=days-6;
            int price= remaining_2 * 2750 + 21000;
            int total= (price/100)*19 +price ;
            System.out.println(" The Total Bill is: "+ total + "Rs");

        }
        else{
            int remaining_3=days-9;
            int price= remaining_3*2500 +92250;
            int total= (price/100)*19 + price;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class taxi_fare {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);//constructor
        System.out.println("Enter the no of kms: ");
        int kms=sc.nextInt();
        if (kms==1){
            int total=20;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
        else if(kms<=6 ){
            int remaining_1=kms-1;
            int total= remaining_1*10 +20;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
        else if(kms<=16){
            int remaining_2=kms-6;
            int total= remaining_2*12 + 70;
            System.out.println(" The Total Bill is: "+ total + "Rs");

        }
        else{
            int remaining_3=kms-16;
            int total= remaining_3*15 + 190;
            System.out.println(" The Total Bill is: "+ total + "Rs");
        }
    sc.close();
    }
}

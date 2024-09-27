// import java.util.Scanner;

// public class menu_driven {
//     public void co_prime_or_not(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first integer: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter the second integer: ");
//         int num2 = scanner.nextInt();
//         boolean areCoprime = isCoprime(num1, num2);
//         if (areCoprime) {
//             System.out.println(num1 + " and " + num2 + " are coprime.");
//         } else {
//             System.out.println(num1 + " and " + num2 + " are not coprime.");
//         }
//         scanner.close();
//     }
//     private static boolean isCoprime(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a == 1;
//     }
//     public void HCFCalculator(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input first number
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();

//         // Input second number
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();

//         // Calculate HCF using a for loop
//         int hcf = calculateHCF(num1, num2);

//         // Display the result
//         System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

//         // Close the scanner
//         scanner.close();
//     }
//     private static int calculateHCF(int a, int b) {
//         int hcf = 1;
//         int smaller = (a < b) ? a : b;
//         for (int i = 1; i <= smaller; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 hcf = i; 
//             }
//         }

//         return hcf;
//     }

//     public void Hotel(){
//         Scanner sc = new Scanner (System.in);//constructor
//         System.out.println("Enter the number of days: ");
//         int days=sc.nextInt();
//         if (days<=3){
//             int price=days*3750;
//             int total= (price/100)*19 + price;
//             System.out.println(" The Total Bill is: "+ total + "Rs");
//         }
//         else if(days>3 && days<=6){
//             int remaining_1=days-3;
//             int price= remaining_1 * 3250 +11250;
//             int total= (price/100)*19 + price;
//             System.out.println(" The Total Bill is: "+ total + "Rs");
//         }
//         else if(days>6 && days<=9){
//             int remaining_2=days-6;
//             int price= remaining_2 * 2750 + 21000;
//             int total= (price/100)*19 +price ;
//             System.out.println(" The Total Bill is: "+ total + "Rs");

//         }
//         else{
//             int remaining_3=days-9;
//             int price= remaining_3*2500 +92250;
//             int total= (price/100)*19 + price;
//             System.out.println(" The Total Bill is: "+ total + "Rs");
//         }
//         sc.close();
//     }

//     public void adding_arrays(String[] args) {
//         // Create arrays P and Q
//         int[] P = {1, 2, 3, 4, 5, 6};
//         int[] Q = {7, 8, 9, 10};

//         int sizeR = P.length + Q.length;
//         int[] R = new int[sizeR];
//         for (int i = 0; i < P.length; i++) {
//             R[i] = P[i];
//         }
//         for (int i = 0; i < Q.length; i++) {
//             R[P.length + i] = Q[i];
//         }
//         System.out.print("Resultant array R: ");
//         for (int i = 0; i < R.length; i++) {
//             System.out.print(R[i] + " ");
//         }
//     }
//     public void word_separate(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a sentence: ");
//         String[] words = scanner.nextLine().split("\\s+");

//         System.out.println("Words in separate lines:");
//         for (String word : words) System.out.println(word);

//         scanner.close();
//     }
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("1. Check for Co-prime");
//         System.out.println("2. Display the HCF");
//         System.out.println("3. Calculate the Rent of the hotel");
//         System.out.println("4. Merge an Array");
//         System.out.println("5. Display Words in separate lines");
//         System.out.println("6. EXIT");
//         System.out.println("Enter your choice(1/2/3/4/5)");
//         int choice = scanner.nextInt();
//         switch (choice) {
//             case 1:
//                 object.co_prime_or_not();
//                 break;
//             case 2:object.HCFCalculator();
//                 break;
//             case 3:
//                 object.Hotel();
//                 break;
//             case 4:
//                 object.adding_arrays();
//                 break;
//             case 5:
//                 object.word_separate();
//                 break;
//             default:
//                 break;
//         }
//     scanner.close();
//     }
// }


import java.util.Scanner;

public class menu_driven {
    // Removed the unnecessary String[] args from each method signature
    public void coPrimeOrNot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        boolean areCoprime = isCoprime(num1, num2);
        if (areCoprime) {
            System.out.println(num1 + " and " + num2 + " are coprime.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not coprime.");
        }
        scanner.close();
    }

    private static boolean isCoprime(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 1;
    }

    public void hcFCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    private static int calculateHCF(int a, int b) {
        int hcf = 1;
        int smaller = (a < b) ? a : b;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    public void hotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        if (days <= 3) {
            int price = days * 3750;
            int total = (price / 100) * 19 + price;
            System.out.println(" The Total Bill is: " + total + "Rs");
        } else if (days > 3 && days <= 6) {
            int remaining_1 = days - 3;
            int price = remaining_1 * 3250 + 11250;
            int total = (price / 100) * 19 + price;
            System.out.println(" The Total Bill is: " + total + "Rs");
        } else if (days > 6 && days <= 9) {
            int remaining_2 = days - 6;
            int price = remaining_2 * 2750 + 21000;
            int total = (price / 100) * 19 + price;
            System.out.println(" The Total Bill is: " + total + "Rs");

        } else {
            int remaining_3 = days - 9;
            int price = remaining_3 * 2500 + 92250;
            int total = (price / 100) * 19 + price;
            System.out.println(" The Total Bill is: " + total + "Rs");
        }
        sc.close();
    }

    public void addingArrays() {
        int[] P = {1, 2, 3, 4, 5, 6};
        int[] Q = {7, 8, 9, 10};

        int sizeR = P.length + Q.length;
        int[] R = new int[sizeR];
        for (int i = 0; i < P.length; i++) {
            R[i] = P[i];
        }
        for (int i = 0; i < Q.length; i++) {
            R[P.length + i] = Q[i];
        }
        System.out.print("Resultant array R: ");
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
    }

    public void wordSeparate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String[] words = scanner.nextLine().split("\\s+");

        System.out.println("Words in separate lines:");
        for (String word : words) System.out.println(word);

        scanner.close();
    }

    public static void main(String[] args) {
        menu_driven object = new menu_driven(); // Create an object of the class

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Check for Co-prime");
            System.out.println("2. Display the HCF");
            System.out.println("3. Calculate the Rent of the hotel");
            System.out.println("4. Merge an Array");
            System.out.println("5. Display Words in separate lines");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice (1/2/3/4/5/6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    object.coPrimeOrNot();
                    break;
                case 2:
                    object.hcFCalculator();
                    break;
                case 3:
                    object.hotel();
                    break;
                case 4:
                    object.addingArrays();
                    break;
                case 5:
                    object.wordSeparate();
                    break;
                default:
                    System.out.println("The input is invalid");
            }
        } while (choice != 6);

        scanner.close();
    }
}
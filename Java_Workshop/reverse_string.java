// import java.util.Scanner;
// //import javax.print.DocFlavor.STRING;
// public class reverse_string {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String inputString = scanner.nextLine();

        
//         String reversedString = reverseString(inputString);

        
//         System.out.println("Reversed string: " + reversedString);

//         scanner.close();
//     }

    
//     private static String reverseString(String input) {
//         char[] charArray = input.toCharArray();
//         int start = 0;
//         int end = input.length() - 1;

        
//         while (start < end) {
//             char temp = charArray[start];
//             charArray[start] = charArray[end];
//             charArray[end] = temp;
//             start++;
//             end--;
//         }
//         return new String(charArray);
//     }
// }

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    private static String reverseString(String input) {
        // Using StringBuilder to efficiently reverse the string
        StringBuilder reversedStringBuilder = new StringBuilder(input);
        reversedStringBuilder.reverse();

        // Convert StringBuilder back to String
        return reversedStringBuilder.toString();
    }
}
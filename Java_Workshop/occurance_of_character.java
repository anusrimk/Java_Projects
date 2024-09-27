import java.util.Scanner;
public class occurance_of_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input a character
        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);

        // Store the occurrences of the character in an array
        int[] charCountArray = new int[inputString.length()];
        int totalCount = 0;

        // Count occurrences and store in the array
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                charCountArray[i] = 1;
                totalCount++;
            }
        }

        // Display the result
        System.out.println("Occurrences of '" + targetChar + "' in the string: " + totalCount);

        scanner.close();
    }
}

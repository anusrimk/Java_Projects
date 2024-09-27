import java.util.Scanner;
public class word_separate_line {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String[] words = scanner.nextLine().split("\\s+");

        System.out.println("Words in separate lines:");
        for (String word : words) System.out.println(word);

        scanner.close();
    }
}

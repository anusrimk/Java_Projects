import java.util.Scanner;

public class first_letter_of_word_cap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        
        String capitalizedSentence = capitalizeWords(inputSentence);

        
        System.out.println("Capitalized sentence: " + capitalizedSentence);

        scanner.close();
    }


    private static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder();

  
        String[] words = sentence.split("\\s");

        for (String word : words) {
            
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1)).append(" ");
            }
        }


        return result.toString().trim();
    }
}
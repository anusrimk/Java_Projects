// package Daily_Practice_Java;

// public class StringMethods {
//     public static void main(String[] args) {
//         String greeting = "Java Programming";
//         char[] letters = {'c', 'o', 'd', 'i', 'n', 'g'};
//         String codeWord = new String(letters);
//         String sampleText = new String("practice");


//         System.out.println("greeting: " + greeting);
//         System.out.println("codeWord: " + codeWord);
//         System.out.println("sampleText: " + sampleText);

//         System.out.println("Length of greeting: " + greeting.length());

//         System.out.println("Character at index 3 of greeting: " + greeting.charAt(3));

//         System.out.println("greeting equals sampleText: " + greeting.equals(sampleText));

//         System.out.println("greeting equals 'java programming' (ignore case): " + greeting.equalsIgnoreCase("java programming"));

//         System.out.println("Substring of greeting from index 5: " + greeting.substring(5));

//         System.out.println("greeting in uppercase: " + greeting.toUpperCase());

//         System.out.println("greeting in lowercase: " + greeting.toLowerCase());

//         System.out.println("Index of 'a' in greeting: " + greeting.indexOf('a'));

//         String newGreeting = greeting.concat(" - Let's code!");
//         System.out.println("Concatenated string: " + newGreeting);

//         String trimmedGreeting = greeting.trim();
//         System.out.println("Trimmed greeting: '" + trimmedGreeting + "'");
        
//         String replacedGreeting = trimmedGreeting.replace('a', 'X');
//         System.out.println("Replaced 'a' with 'X' in trimmedGreeting: " + replacedGreeting);

//         System.out.println("Does greeting start with 'Java'? " + greeting.startsWith("Java"));


//         System.out.println("Does greeting end with 'Programming'? " + greeting.endsWith("Programming"));

//         int value = 30;
//         String strValue = String.valueOf(value);
//         System.out.println(strValue + 10);

//         String result = String.join(" ", "Alpha", "Beta", "Gamma");
//         System.out.println(result);

//         result = String.join("", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
//         System.out.println(result);

//         /////////////////////////////

//         String str = "Welcome to Java World";
//         int count = 0;
//         for (int i = 0; i <= str.length(); i++) {
//             if(str.charAt(i) == 'o'){
//                 count++;
//             }
//         }
//         System.out.println("Count of 'o' in the string: " + count);
//         }
// }

package Daily_Practice_Java;

public class StringMethods {
    public static void main(String[] args) {
        String greeting = "Java Programming";
        char[] letters = {'c', 'o', 'd', 'i', 'n', 'g'};
        String codeWord = new String(letters);
        String sampleText = new String("practice");


        System.out.println("greeting: " + greeting);
        System.out.println("codeWord: " + codeWord);
        System.out.println("sampleText: " + sampleText);

        System.out.println("Length of greeting: " + greeting.length());

        System.out.println("Character at index 3 of greeting: " + greeting.charAt(3));

        System.out.println("greeting equals sampleText: " + greeting.equals(sampleText));
        System.out.println("greeting equals 'java programming' (ignore case): " + greeting.equalsIgnoreCase("java programming"));

        System.out.println("Substring of greeting from index 5: " + greeting.substring(5));

        System.out.println("greeting in uppercase: " + greeting.toUpperCase());
        System.out.println("greeting in lowercase: " + greeting.toLowerCase());

        System.out.println("Index of 'a' in greeting: " + greeting.indexOf('a'));

        String newGreeting = greeting.concat(" - Let's code!");
        System.out.println("Concatenated string: " + newGreeting);

        String trimmedGreeting = greeting.trim();
        System.out.println("Trimmed greeting: '" + trimmedGreeting + "'");

        String replacedGreeting = trimmedGreeting.replace('a', 'X');
        System.out.println("Replaced 'a' with 'X' in trimmedGreeting: " + replacedGreeting);

        System.out.println("Does greeting start with 'Java'? " + greeting.startsWith("Java"));
        System.out.println("Does greeting end with 'Programming'? " + greeting.endsWith("Programming"));

        int value = 30;
        String strValue = String.valueOf(value);
        System.out.println("Value as string with 10 added: " + (strValue + 10));  // "3010"


        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println("Joined string with spaces: " + result);

        result = String.join("", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
        System.out.println("Joined string without delimiter: " + result);

    
        //join is a static method because it is directly getting called from the string class

        String str = "Welcome to Java World";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {  
            if (str.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("Count of 'o' in the string: " + count);
    }
}

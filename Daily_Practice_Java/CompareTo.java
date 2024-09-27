package Daily_Practice_Java;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "";
        String s3 = "me";

        String string1 = "Book";
        String string2 = "book";
        String string3 = "look";
        String string4 = "abc";
        String string5 = "BEEN";

        System.out.println(s1.compareTo(s2)); //5
        System.out.println(s2.compareTo(s3)); //-2

        System.out.println(string1.compareToIgnoreCase(string2));
        System.out.println(string1.compareToIgnoreCase(string3));
        System.out.println(string1.compareToIgnoreCase(string4));
        System.out.println(string1.compareToIgnoreCase(string5));

    }

}
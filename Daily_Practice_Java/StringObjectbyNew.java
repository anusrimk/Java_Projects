package Daily_Practice_Java;

public class StringObjectbyNew {
    public static void main(String[] args) {
        String s1 = "Hello World";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
}

package Daily_Practice_Java;
//WAP to demonstrate methods of StringBuilder class

public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1);
        StringBuilder reverseSb = sb1.reverse();
        System.out.println("Reverse String = " + reverseSb );
        System.out.println("Modified StringBuilder = " + sb1 );


        StringBuilder sb2 = new StringBuilder();
        System.out.println("Capacity of StringBuilder = " + sb2.capacity());

        sb2.append("Hello");
        sb2.append(" ");
        sb2.append("World!");
        System.out.println(sb2.toString());

        sb2.insert(6, "beautiful");
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1, 3, "Java");
        System.out.println("After Replace() String =" + sb3.toString());

        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1, 3);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.capacity());
        sb5.append("Hello");
        System.out.println(sb5.capacity());

        sb5.append("Java is my favourite language");
        System.out.println(sb5.capacity());

        sb5.ensureCapacity(10);
        System.out.println(sb5.capacity());
        sb5.ensureCapacity(50);
        System.out.println(sb5.capacity());

        StringBuilder sb6 = new StringBuilder("Hello");
        System.out.println(sb6.charAt(1));
        System.out.println(sb6.length());
        System.out.println(sb6.substring(1,5));
        System.out.println(sb6.substring(1));
        }
    
}

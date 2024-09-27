package Daily_Practice_Java;

public class BasicExceptionHandling {
    // public static void main(String[] args) {
    //     int d;
    //     try{
    //         d = 0;
    //         int a = 42 / d;
    //         System.out.println("Won't be printed "+a);
    //     }catch(ArithmeticException e){
    //         System.out.println("Division by zero");
    //     }

    //     System.out.println("After catch executed");
    // }
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);
            int b = 42 / a;
            int[] c = { 1 };
            c[20] = 20;
            System.out.println("Won't be printed " + a + b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        System.out.println("After catch executed");
    }

}

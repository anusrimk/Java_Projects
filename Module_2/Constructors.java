// Question 12
package Module_2;

public class Constructors {
    Constructors(){
        System.out.println("Top level constructor");
    }
}

class SubClass1 extends Constructors{
    SubClass1(){
        System.out.println("Subclass 1 constructor");
    }
}

class SubClass2 extends SubClass1{
    String name = "Prem";
    SubClass2(){
        System.out.println("Subclass 2 constructor");
    }
}

class Test{
    public static void main(String[] args) {
        SubClass2 c = new SubClass2();
        System.out.println(c.name);
    }
}
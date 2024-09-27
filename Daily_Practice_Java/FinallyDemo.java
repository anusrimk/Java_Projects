package Daily_Practice_Java;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("Finally block of procA");
        }
    }

    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("Finally block of procB");
        }
    }

    static void procC() {
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("Finally block of procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("exception caught");
        }
        procB();
        procC();
    }
}
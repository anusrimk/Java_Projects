package Module_4;

class JavaThread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Java");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class PythonThread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println("Python");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class CppThread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("C++");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

public class Q3_Runnableinf {
    public static void main(String[] args) {
        JavaThread jt = new JavaThread();
        PythonThread pt = new PythonThread();
        CppThread ct = new CppThread();

        Thread th1 = new Thread(jt);
        Thread th2 = new Thread(pt);
        Thread th3 = new Thread(ct);

        th1.start();
        th2.start();
        th3.start();
    }
}
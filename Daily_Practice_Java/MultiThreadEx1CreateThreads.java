// write a prog to create 3 threads in your program, first thread will print hello 5 times, second thread will print hi 5 times, and third thread will print bye 5 times.
package Daily_Practice_Java;
import java.lang.Thread;

class NewThread1 extends Thread {
    NewThread1() {
        super("NewThread1");
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }

    }
}


class NewThread2 extends Thread {
    NewThread2() {
        super("NewThread2");
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class NewThred3 extends Thread {
    NewThred3() {
        super("NewThred3");
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

public class MultiThreadEx1CreateThreads {
    public static void main(String[] args) {
        NewThread1 t1 = new NewThread1();
        NewThread2 t2 = new NewThread2();
        NewThred3 t3 = new NewThred3();

        t1.start();
        t2.start();
        t3.start();
    }
}

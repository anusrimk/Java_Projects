package Daily_Practice_Java;

class Thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Prem");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }

    }
}

class Thread2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thatikonda");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class Thread3 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("6");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

public class MultiThreadEx2CreateThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();
    }
}
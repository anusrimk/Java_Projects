package Module_4;



class FirstNameThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Anusri");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class LastNameThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Karmokar");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

public class Q1_Threads{
    public static void main(String[] args) {
        FirstNameThread t1 = new FirstNameThread();
        LastNameThread t2 = new LastNameThread();

        t1.start();
        t2.start();
    }
}


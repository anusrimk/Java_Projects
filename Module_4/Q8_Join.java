package Module_4;

public class Q8_Join {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println("1 interrupted");
                }
            }
        }); 


        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println("2 interrupted");
                }
            }
        });


        t1.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }


        t2.start();
    }
}

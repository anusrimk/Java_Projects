package Module_4;

public class Q7_Deadlock {
    public static void main(String[] args) {
        final String food = "Food";
        final String water = "Water";


        Thread t1 = new Thread() {
            public void run() {
                synchronized (food) {
                    System.out.println("Thread 1: locked resource 1 (Food)");
                    try {
                        Thread.sleep(100); 
                    } catch (InterruptedException e) {
                        System.out.println("Thread 1 interrupted.");
                    }
                    synchronized (water) {
                        System.out.println("Thread 1: locked resource 2 (Water)");
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (water) {
                    System.out.println("Thread 2: locked resource 1 (Water)");
                    try {
                        Thread.sleep(100); 
                    } catch (InterruptedException e) {
                        System.out.println("Thread 2 interrupted.");
                    }
                    synchronized (food) {
                        System.out.println("Thread 2: locked resource 2 (Food)");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

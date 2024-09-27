package Module_4;

class Q1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception in Consumer");
            }
        }

        System.out.println("Got: " + n);
        valueSet = false; 
        notify(); 
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait(); // Wait for the consumer to consume the value
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception in Producer");
            }
        }


        this.n = n;
        valueSet = true; 
        System.out.println("Put: " + n);
        notify(); // Notify the consumer that a new value is available
    }
}


class Producer1 implements Runnable {
    Q1 q;

    Producer1(Q1 q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++); 
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception in Producer Thread");
            }
        }
    }
}


class Consumer1 implements Runnable {
    Q1 q;

    Consumer1(Q1 q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            q.get(); 
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception in Consumer Thread");
            }
        }
    }
}


public class Q6_InterThreadComm {
    public static void main(String[] args) {
        Q1 q = new Q1(); 


        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);


        Thread t1 = new Thread(p, "Producer");
        Thread t2 = new Thread(c, "Consumer");


        t1.start();
        t2.start();


        System.out.println("Press Ctrl-C to stop.");
    }
}

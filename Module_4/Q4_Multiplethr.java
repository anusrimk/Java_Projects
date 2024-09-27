package Module_4;

class Counter {
    private int count = 0;

    // Synched method so that we can increment the counter
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    Counter counter;

    // Constructor to initialize Counter object
    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Increment         
        }
    }
}

public class Q4_Multiplethr {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(); 


        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        CounterThread t3 = new CounterThread(counter);


        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();


        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

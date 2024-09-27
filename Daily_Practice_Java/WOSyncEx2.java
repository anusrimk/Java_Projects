package Daily_Practice_Java;

class CounterEx2 {
    int count = 0;

    // Increment method without synchronization (leads to race conditions)
    public void increment() {
        count++;
    }
}

class Class2 implements Runnable {
    CounterEx2 counter;

    public Class2(CounterEx2 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Increment count
        }
    }
}

class Class2WO implements Runnable {
    CounterEx2 counter;

    public Class2WO(CounterEx2 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Increment count
        }
    }
}

public class WOSyncEx2 {
    public static void main(String[] args) {
        CounterEx2 c = new CounterEx2();
        Class2 c1 = new Class2(c);
        Class2WO c2 = new Class2WO(c);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count without synchronization: " + c.count);
    }
}
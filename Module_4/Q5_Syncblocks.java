package Module_4;

class CounterEx3 {
    int count;


    public void increment() {
        // Synchronized block ensures only one thread can increment at a time
        synchronized (this) {
            count++;
        }
    }
}

class Class1S implements Runnable {
    CounterEx3 c;


    Class1S(CounterEx3 c) {
        this.c = c;
    }


    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

class Class2S implements Runnable {
    CounterEx3 c;


    Class2S(CounterEx3 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Q5_Syncblocks {
    public static void main(String[] args) throws InterruptedException {
        CounterEx3 c = new CounterEx3(); 

        // Instances of Class1S & Class2S with shared Counter
        Class1S obj1 = new Class1S(c);
        Class2S obj2 = new Class2S(c);


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start();
        t2.start();


        t1.join();
        t2.join();


        System.out.println("Final counter value: " + c.count);
    }
}
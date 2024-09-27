// write a program to create your own thread by extendiing thread class
package Daily_Practice_Java;
import java.lang.Thread;

class NewThread1 extends Thread{
    NewThread1(){
        super("Demo Thread");
    }
    public void run(){
        System.out.println("Child Thread "+ Thread.currentThread());
    }
}

public class ThreadEx2CreateThruExtends1 {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();
        nt.start();
        System.out.println("Main Thread "+ Thread.currentThread());
    }
}


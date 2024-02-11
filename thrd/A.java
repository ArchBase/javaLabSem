import java.util.*;

class MyThread extends Thread{
    public void run(){
        System.out.println("Hey there");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("haI");
    }
}

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        //MyThread t = new MyThread();
        //t.start();
        Thread tg = new Thread(new MyThread2());
        tg.start();

    }
}



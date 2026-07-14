package org.example.Multithreading;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable thread");
        Thread.currentThread().setName("MyRunnable");
        System.out.println(Thread.currentThread().getName());

    }
}

public class SecondThread {

    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable());

        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}

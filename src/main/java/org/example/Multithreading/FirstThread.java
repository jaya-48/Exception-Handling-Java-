package org.example.Multithreading;

class Demo extends Thread {

        public void run() {
            System.out.println("Thread is running");
            System.out.println(Thread.currentThread().getName());
        }
}
public class FirstThread {
        public static void main(String[] args) {

            Demo t = new Demo();
            t.start();
            System.out.println(Thread.currentThread().getName());

        }
}

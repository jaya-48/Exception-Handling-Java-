package org.example.Multithreading;

class Demo1 extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}

        }
    }
}

public class MyThread {

    public static void main(String[] args) throws Exception {

        Demo1 t = new Demo1();

        t.start();

        t.join();

        System.out.println("Main Thread");
    }
}

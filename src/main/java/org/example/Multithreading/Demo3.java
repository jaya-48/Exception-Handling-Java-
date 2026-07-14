package org.example.Multithreading;

class MyThread3 extends Thread {
    Table1 t;

    MyThread3(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread4 extends Thread {
    Table1 t;

    MyThread4(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class Demo3 {
    public static void main(String[] args) {

        Table1 t = new Table1();

        MyThread3 t1 = new MyThread3(t);
        MyThread4 t2 = new MyThread4(t);

        t1.start();
        t2.start();
    }
}
package org.example.Multithreading;

import com.sun.source.tree.SynchronizedTree;

public class Table1 {

    synchronized void printTable(int n) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(n * i);

        }

    }


}
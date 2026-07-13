package org.example;

public class Calculator {

        public void method1() throws ArithmeticException {

            method2();

        }

        public void method2() throws ArithmeticException {

            method3();

        }

        public void method3() {

            int a = 10 / 0;

        }
    public static void main(String[] args) {

        Calculator c = new Calculator();

        try {

            c.method1();

        }

        catch(ArithmeticException e) {

            System.out.println("Handled in Main");

        }

    }
}

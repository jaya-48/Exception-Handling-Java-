package org.example;

public class MultipleCatch {

        public static void main(String[] args) {

            try {

                int arr[] = {10,20,30};

                System.out.println(arr[5]);

                int a = 10/0;

            }

            catch(ArrayIndexOutOfBoundsException e) {

                System.out.println("Array Index Exception");

            }

            catch(ArithmeticException e) {

                System.out.println("Arithmetic Exception");

            }

            catch(Exception e) {

                System.out.println("Parent Exception");

            }

            finally {

                System.out.println("Finally Always Executes");

            }

        }
}

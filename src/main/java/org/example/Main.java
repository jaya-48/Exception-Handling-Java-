package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Application Started");

        Bank bank = new Bank();

        try {

            bank.withdraw(5000, 7000);

            System.out.println("Transaction Completed");

        }

        catch (InvalidAmountException e) {

            System.out.println("Exception Caught");
            System.out.println(e.getMessage());

        }

        finally {

            System.out.println("Closing Database Connection");

        }

        System.out.println("Application Ended");

    }

}
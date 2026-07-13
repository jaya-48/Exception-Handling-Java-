package org.example;
public class Bank {


    public void withdraw(int balance, int amount) throws InvalidAmountException {

        System.out.println("Withdraw process started...");

        if (amount > balance) {
            throw new InvalidAmountException("Insufficient Balance");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance : " + (balance - amount));
    }
}

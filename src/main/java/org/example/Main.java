package org.example;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();


        acc1.checkBalance();
        acc1.deposit(100);
        System.out.println(" ");
        acc1.withdraw(20);
        acc1.checkBalance();
        System.out.println(" ");
        acc1.transfer(40, acc2);
        acc1.checkBalance();
    }
}
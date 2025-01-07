package org.example;

public class Account {
    private double bilance;

    public void deposit(double bilanceToDeposit) {
        bilance += bilanceToDeposit;
        System.out.println("Successful deposit!");
    }

    public void withdraw(double bilanceToWithdraw) {
        if(bilanceToWithdraw > bilance) {
            System.out.println("Your bilance is not that high!");
        } else {
            bilance -= bilanceToWithdraw;
            System.out.println("Successful withdraw!");
        }
    }

    public double checkBalance() {
        return bilance;
    }

    public void transfer(double bilanceToTransfer, Account account) {
        if (bilanceToTransfer > this.bilance) {
            System.out.println("Your bilance is not that high!");
        } else {
            this.bilance -= bilanceToTransfer;
            account.deposit(bilanceToTransfer);
            System.out.println("Successful transfer!");
        }
    }

}

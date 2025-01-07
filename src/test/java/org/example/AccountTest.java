package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account acc1;
    private Account acc2;


    @BeforeEach
    void setUp() {
        acc1 = new Account();
        acc2 = new Account();
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        acc1.deposit(100);
        assertEquals(100, acc1.checkBalance());
        assertNotEquals(20, acc1.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        acc1.deposit(100);

        acc1.withdraw(20);
        assertEquals(80, acc1.checkBalance());
        assertNotEquals(10, acc1.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void checkBalance() {
        acc1.deposit(20);

        assertEquals(20, acc1.checkBalance());
        assertNotEquals(10, acc1.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void transfer() {
        acc1.deposit(100);

        acc1.transfer(20, acc2);
        assertEquals(80, acc1.checkBalance());
        assertNotEquals(10, acc1.checkBalance());

        assertEquals(20, acc2.checkBalance());
        assertNotEquals(10, acc2.checkBalance());
    }


}
package com.kodewala.threadpractice2;

import java.awt.desktop.ScreenSleepEvent;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount2 {
    private int balance = 10000;
    
    ReentrantLock reentrant = new ReentrantLock(); // ReentrantLock gives the manual control of synchronized keyword, i.e locking and unlocking

    public void withdraw(int amount) throws InterruptedException { 
    	
    	reentrant.lock(); // locking
    	
    	//boolean lockStatus = reentrant.tryLock(2000, TimeUnit.MILLISECONDS);

    	//System.out.println("BankAccount2.withdraw()" + lockStatus);
    	
    	//if (Lock.tryLock())

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " completed withdrawal. Balance = " + balance);

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " Insufficient Balance");
        }
        
        reentrant.unlock(); //unlocking
    }
    
    

    public int getBalance() {
        return balance;
    }
}

class Customer2 extends Thread {

    BankAccount2 bankAccount;

    public Customer2(BankAccount2 bankAccount) {
        super();
        this.bankAccount = bankAccount;
    }

    public void run() {
        try {
			bankAccount.withdraw(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

public class Driver {

    public static void main(String[] args) throws InterruptedException {

        BankAccount2 account = new BankAccount2();

        Customer2 customer1 = new Customer2(account);
        Customer2 customer2 = new Customer2(account);

        customer1.start();
        customer2.start();
        
        customer1.join();
        customer2.join();
        
        System.out.println("Final balance = " + account.getBalance());
    }
}
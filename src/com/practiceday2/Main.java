package com.practiceday2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Locker locker = new Locker("LKR-7788",1234);
       BankAccount bA1 = new BankAccount("SBIN1001",50000.75,locker);
       BankAccount bA2 = (BankAccount) bA1.clone();
       bA2.locker.lockerId = "LKR-7787";
       bA2.locker.securityCode = 1235;
       bA2.balance = 500000.09;
        System.out.println(bA2.locker.lockerId+" "+bA2.locker.securityCode);
        System.out.println(bA1.locker.lockerId+" "+bA1.locker.securityCode);
        System.out.println(bA2.balance);
        System.out.println(bA1.balance);
    }
}

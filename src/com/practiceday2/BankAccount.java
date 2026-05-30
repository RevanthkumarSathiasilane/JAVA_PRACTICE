package com.practiceday2;

public class BankAccount implements Cloneable {
     String accountNumber;
     double balance;
     Locker locker;
    public BankAccount(String accountNumber,double balance,Locker locker){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.locker=locker;
    }
    public Object clone() throws CloneNotSupportedException{
        Locker newLocker = new Locker(locker.lockerId, locker.securityCode);
        return new BankAccount(accountNumber,balance,newLocker);
    }
}

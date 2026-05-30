package com.practiceday1;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a pin:");
        int pin = sc.nextInt();
        int balance = 1000;
        if(pin==1234){
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Current Balance = "+balance);
                    break;
                case 2:
                    System.out.print("Enter a amount to withdraw:");
                    int withdraw = sc.nextInt();
                    if(balance>=withdraw) {
                        balance -= withdraw;
                        System.out.println("Balance = "+balance);
                    }
                    else {
                        System.out.println("Can't Withdraw");
                    }
                    break;
                case 3:
                    System.out.print("Enter a amount to deposit:");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Balance = "+balance);
                    break;
                default:
                    System.out.println("Invalid Menu");
            }
        }else{
            System.out.println("Wrong PIN!!!");
        }

    }
}

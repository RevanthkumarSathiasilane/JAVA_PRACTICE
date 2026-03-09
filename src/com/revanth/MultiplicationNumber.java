package com.revanth;
import java.util.Scanner;
public class MultiplicationNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication:");
        int number = sc.nextInt();
        multiplicationTable(number);
    }
    static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}

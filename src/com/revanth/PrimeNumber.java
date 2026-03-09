package com.revanth;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check a number is prime or not:");
        int value = sc.nextInt();
        int start = 2;
        int end = value-1;
        int found = 0;
        while(start*start<=value){
            if(value%start==0) {
                found = 1;
                break;
            }
            start++;
        }
        if(found == 1) System.out.println("Not a prime");
        else System.out.println("Prime");
    }
}

package com.revanth;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean revAns = revNumber(num);
        System.out.println(revAns);
    }
    static boolean revNumber(int value){
        int temp = value;
        int sum = 0;
        while(value>0){
            int rem = value%10;
            sum=(sum*10)+rem;
            value/=10;
        }
        if (sum==temp) return true;
        return false;
    }
}

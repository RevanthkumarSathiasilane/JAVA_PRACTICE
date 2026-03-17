package com.revanth;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it!!:");
        int value = sc.nextInt();
        boolean revAns = revNumber(value);
        System.out.println(revAns);
    }
    static boolean revNumber(int value){
        int sum = 0;
        while(value>0){
            int rem = value%10;
            sum=(sum*10)+rem;
            value/=10;
        }
        if(value == sum) return true;
        return false;
    }
}

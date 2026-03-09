package com.revanth;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit:");
        int digit = sc.nextInt();
        int sumOfDigit = sumDigit(digit);
        System.out.println(sumOfDigit);
    }
    static int sumDigit(int digit){
        int sum = 0;
        while(digit>0){
            int rem = digit%10;
            sum+=rem;
            digit/=10;
        }
        return sum;
    }
}

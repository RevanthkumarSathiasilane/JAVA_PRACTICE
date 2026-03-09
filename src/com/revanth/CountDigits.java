package com.revanth;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int digit = sc.nextInt();
        int ans1= countDigit1(digit);
        int ans2= countDigit2(digit);
        System.out.println(ans1 + " "+ ans2);
    }
    static int countDigit1(int digit){
        int count =0;
        while(digit>0){
            int rem = digit%10;
            count++;
            digit/=10;
        }
        return count;
    }
    static int countDigit2(int digit){
        int count = (int)(Math.log10(digit))+1;
        return count;
    }
}

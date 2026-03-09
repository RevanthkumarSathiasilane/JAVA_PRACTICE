package com.revanth;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to print Fibonacci series:");
        int range = sc.nextInt();
        int first = 0;
        int second = 1;
        int i = 1;
        while(i<=range){
            System.out.print(first+" ");
            int sum = first+second;
            first = second;
            second = sum;
            i++;
        }
    }
}

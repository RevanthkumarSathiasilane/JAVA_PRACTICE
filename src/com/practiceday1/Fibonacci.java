package com.practiceday1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int f = 0;
        int s = 1;
        int sum = 0;
        System.out.printf("%d ",f);
        System.out.printf("%d ",s);
        for(int i=3;i<=input;i++){
            sum=f+s;
            f=s;
            s = sum;
            System.out.printf("%d ",sum);
        }
    }
}

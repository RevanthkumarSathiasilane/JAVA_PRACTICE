package com.bala;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        int o=a;
        while (a > 0) {
            int l = a % 10;
            s = s * 10 + l;
            a /= 10;
        }
        if (o == s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

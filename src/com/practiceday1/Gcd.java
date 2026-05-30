package com.practiceday1;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int rem = 1;
        while(rem!=0){
            rem =val1%val2;
            val1 = val2;
            val2 = rem;
        }
        System.out.println(val1);
    }
}

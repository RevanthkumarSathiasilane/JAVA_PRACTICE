package com.practiceday1;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = (int)Math.log10(input)+1;
        System.out.println(count);
    }
}

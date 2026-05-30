package com.practiceday1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<input){
            if(input%i==0) {
                sum += i;
            }
            i++;
        }
        if(sum==input) System.out.println("True");
        else System.out.println("False");
    }
}

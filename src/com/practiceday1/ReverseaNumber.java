package com.practiceday1;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int input = sc.nextInt();
        int rev = 0;
        while(input!=0){
            int rem = input%10;
            rev = (rev*10)+rem;
            input/=10;
        }
        System.out.println(rev);
    }
}

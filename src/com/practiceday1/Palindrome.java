package com.practiceday1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int input = sc.nextInt();
        int rev = 0;
        int temp = input;
        while(input!=0){
            int rem = input%10;
            rev = (rev*10)+rem;
            input/=10;
        }
        if(temp == rev) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}

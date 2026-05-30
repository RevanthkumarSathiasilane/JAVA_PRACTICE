package com.practiceday1;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int largest = 0;
        while(input!=0){
            int rem = input%10;
            if(rem>largest) largest = rem;
            input/=10;
        }
        System.out.println(largest);
    }
}

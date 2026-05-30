package com.practiceday1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",i,input,i*input);
        }
    }
}

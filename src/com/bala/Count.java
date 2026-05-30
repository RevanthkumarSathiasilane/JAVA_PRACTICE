package com.bala;

import java.util.Scanner;

public class Count {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a>0){
            int l=a%10;
            s=s+1;
            a/=10;
        }
        System.out.println(s);
    }
}

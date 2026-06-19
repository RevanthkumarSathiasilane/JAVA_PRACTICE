package com.Recursion;

public class FunBoth {
    public static void main(String[] args) {
        int n = 5;
        funBoth(n);
    }
    static void funBoth(int n){
        if(n==0) return;
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

}

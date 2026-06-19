package com.Recursion;

public class Nto1Rev {
    public static void main(String[] args) {
        int n = 5;
        funRev(n);
    }
    static void funRev(int n){
        if(n==0) return;
        funRev(n-1);
        System.out.println(n) ;
    }
}

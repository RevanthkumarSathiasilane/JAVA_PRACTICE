package com.Recursion;

public class Concept {
    public static void main(String[] args) {
        int n = 5;
        passing(n);
    }
    static void passing(int n){
        if(n==0) return;
        System.out.println(n);
        passing(--n);
    }
}

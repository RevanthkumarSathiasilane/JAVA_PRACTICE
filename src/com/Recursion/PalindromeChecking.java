package com.Recursion;

public class PalindromeChecking {
    public static void main(String[] args){
        int n = 43234;
        if(rev(n)==n) System.out.println(true);
        else System.out.println(false);
    }
    static int rev(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n) return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

}

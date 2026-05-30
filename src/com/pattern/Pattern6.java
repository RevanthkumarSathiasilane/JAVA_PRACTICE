package com.pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int row =1;row<=n;row++){
            int c = row;
            int totalSpace =  n-c;
            for(int sp=1;sp<=totalSpace;sp++){
                System.out.print(" ");
            }
            for(int col=1;col<=c;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

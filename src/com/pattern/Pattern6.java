package com.pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int row =1;row<=n;row++){
            for(int sp=1;sp<=(n-row);sp++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

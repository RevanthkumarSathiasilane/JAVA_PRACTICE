package com.pattern;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            int c = (n-row)+1;
            for(int sp=1;sp<=n-c;sp++){
                System.out.print(" ");
            }
            for(int col=1;col<=c;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

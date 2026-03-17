package com.pattern;


public class Pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }
    static void pattern19(int n){
        int s = 2*n;
        for(int row = 1;row< 2*n; row++){
            int c = row>n? 2*n-row: row;
            int space = 2*(n-c);// 9-2
            for(int col = 1;col<=c;col++){//c = row=2
                System.out.print("* ");
            }
            for(int sp = 1;sp<=space;sp++){//sp=row+1;
                System.out.print(" ");
            }
            for(int col = 1;col<=c;col++) {//c = row;
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

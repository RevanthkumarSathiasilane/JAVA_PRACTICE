package com.pattern;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for(int row = 1;row<2*n;row++){
            int totalCol = (row>n)?2*n-row:row;
            int noOfSpaces = n-totalCol;
            for(int sp=1;sp<=noOfSpaces;sp++){
                System.out.print(" ");
            }
            for(int col = 1;col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

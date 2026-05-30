package com.pattern;

public class Pattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }
    static void pattern30(int n){
        for(int row = 1;row<=n;row++){
            int col = row;
            int space = n-col;
            for(int sp = 1;sp<=space;sp++){
                System.out.print("  ");
            }
            for(int c=col;c>=1;c--){
                System.out.print(c+" ");
            }
            for(int c=2;c<=col;c++) System.out.print(c+" ");
            System.out.println();
        }
    }
}

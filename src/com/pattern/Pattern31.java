package com.pattern;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern31(int n){
        int originalIndex = n;
         int no = 2*n-1;
        for(int row=1;row<2*n;row++){
            for(int col=1;col<2*n;col++){
                int atEveryIndex = originalIndex-Math.min(Math.min(col-1,row-1),Math.min(no-col,no-row));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}

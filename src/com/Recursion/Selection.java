package com.Recursion;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = {4,3,2,1};
        selection(a,a.length,0,0);
        System.out.println(Arrays.toString(a));
    }
    static void selection(int[] a,int r,int c,int max){
        if(r==0) return;
        if(c<r){
            if(a[c]>a[max]) selection(a,r,c+1,c);
            else selection(a,r,c+1,max);
        }
        else{
            int temp = a[max];
            a[max] = a[r-1];
            a[r-1] = temp;
            selection(a,r-1,0,0);
        }
    }
}

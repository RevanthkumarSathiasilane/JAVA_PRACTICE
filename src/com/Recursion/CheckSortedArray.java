package com.Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,56,9};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int i){
        if(i==arr.length-1) return true;
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }

}

package com.Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2,8,7,10};
        System.out.println(sortedArr(arr,0));
    }
    static boolean sortedArr(int[] arr,int i){
        if(i==arr.length-1) return true;
        return arr[i]<arr[i+1] && sortedArr(arr,i+1);
    }
}

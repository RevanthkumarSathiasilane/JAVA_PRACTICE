package com.Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int row=0;row<arr.length;row++){
            arr[row] = sc.nextInt();
        }
        int s = 0, e = arr.length-1;
        reverseArr(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int[] arr,int s, int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}

package com.cyclicSort;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
       int i = 0;
       while(i<arr.length) {
           int correct = arr[i] - 1;
           if (arr[i] != arr[correct]) swap(i,correct,arr);
           else i++;
       }
    }
    static void swap(int i,int correct,int[] arr){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}

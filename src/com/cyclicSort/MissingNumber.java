package com.cyclicSort;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int val = sort(arr);
        System.out.println(val);
    }
    static int sort(int[] arr){
        int i = 0;
            while(i<arr.length){
            int correct = arr[i];
            if(arr[i] != i){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return 0;
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}

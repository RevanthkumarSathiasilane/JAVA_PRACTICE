package com.Arrays;
import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int row=0;row<arr.length;row++){
            arr[row] = sc.nextInt();
        }
        int largest = arr[0];
        findMax(arr,largest);
    }
    static void findMax(int[] arr,int largest){

       for(int row = 0;row<arr.length;row++){
           if(largest<arr[row]){
               largest = arr[row];
           }
       }
        System.out.println(largest);
    }
}

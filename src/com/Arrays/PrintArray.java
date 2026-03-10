package com.Arrays;
import java.util.*;
public class PrintArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter array size:");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int row=0;row<arr.length;row++){
           arr[row] = sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));
    }
}

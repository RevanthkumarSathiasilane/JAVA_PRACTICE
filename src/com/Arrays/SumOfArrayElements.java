package com.Arrays;
import java.util.*;
public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size:");
        int size = sc.nextInt();
        int[] arr=new int[size];
        int sum = 0;
        for(int row=0;row<arr.length;row++){
            arr[row] = sc.nextInt();
        }
        printSum(arr,sum);
    }
    static void printSum(int[] a, int sum){
        for(int row=0;row<a.length;row++) sum+=a[row];
        System.out.println(sum);
    }
}

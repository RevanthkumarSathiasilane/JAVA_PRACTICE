package com.Arrays;

import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int row=0;row<arr.length;row++) {
            arr[row] = sc.nextInt();
        }
        float val = findAverage(arr);
        System.out.printf("%.2f",val);
    }
    static float findAverage(int[] arr){
        int sum = 0;
        for(int row = 0;row<arr.length;row++){
            sum+=arr[row];
        }
        return sum/arr.length;
    }

}

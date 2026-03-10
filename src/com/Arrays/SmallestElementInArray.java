package com.Arrays;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int row=0;row<arr.length;row++){
            arr[row] = sc.nextInt();
        }
        int smallest = arr[0];
        findMin(arr,smallest);
    }
    static void findMin(int[] arr,int smallest){

        for(int row = 0;row<arr.length;row++){
            if(smallest>arr[row]){
                smallest = arr[row];
            }
        }
        System.out.println(smallest);
    }
}

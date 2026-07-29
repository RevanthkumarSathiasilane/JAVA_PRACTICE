package com.ArraysAndStrings.BinarySearch;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2 };
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]) e = mid;
            else if(arr[mid]<arr[mid+1]) s = mid+1;
        }
        return arr[s];
    }
}

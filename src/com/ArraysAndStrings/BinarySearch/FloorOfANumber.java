package com.ArraysAndStrings.BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {23,32,44,56,67,90,101};
        int target = 61;
        System.out.println(floorOfNumber(arr,target));
    }
    static int floorOfNumber(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target) return arr[mid];
            if(arr[mid]<target) s = mid+1;
            else e = mid-1;
        }
        return arr[e];
    }
}

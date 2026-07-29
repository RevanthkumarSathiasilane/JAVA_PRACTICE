package com.ArraysAndStrings.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {23,34,45,67,98,101};
        int target = 65;
        System.out.println(ceilingNumber(arr,target));
    }
    static int ceilingNumber(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target) return arr[mid];
            if(arr[mid]<target) s = mid+1;
            else e = mid-1;
        }
        return arr[s];
    }
}

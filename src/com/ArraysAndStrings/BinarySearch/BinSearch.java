package com.ArraysAndStrings.BinarySearch;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-10,0,3,6,19,30,43,58};
        int target = -18;
        System.out.println(binSearch(arr,target));
    }
    //return the index
    static int binSearch(int[] arr,int target){
        if(arr.length == 0) return -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target) start = mid+1;
            else if(arr[mid]>target) end = mid-1;
            else return mid;
        }
        return 0;
    }
}

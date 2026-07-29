package com.ArraysAndStrings.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {23,45,67,90,102,203,405,506,650,780,920,1000};
        int target = 102;
        System.out.println(findRange(arr,target,0,1));
    }
    //has an issue that, if target is last element it may move out of Bound Element!!!
    static int findRange(int[] arr, int target,int s, int e){
        while(arr[e]<target){
            int newStart = e+1;
            e = e+(e-s+1)*2;
            s = newStart;
        }
        return binSearch(arr,target,s,e);
    }
    static int binSearch(int[] arr, int t, int s,int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==t) return mid;
            else if(arr[mid]<t) s=mid+1;
            else e = mid-1;
        }
        return -1;
    }
}

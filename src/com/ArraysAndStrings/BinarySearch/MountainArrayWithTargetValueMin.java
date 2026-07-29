package com.ArraysAndStrings.BinarySearch;

public class MountainArrayWithTargetValueMin {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,3,1};
       int target = 3;
        System.out.println(findInMountainArray(target,arr));
    }
    static int findInMountainArray(int target, int[] arr) {
        int peak = peakElement(target,arr);
        if(arr[peak] == target) return peak;
        int ans = binSearch(target,arr,0,peak,true);
        if(ans == -1) ans = binSearch(target,arr,peak,arr.length-1,false);
        return ans;
    }
    static int peakElement(int target,int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]) s = mid+1;
            else e = mid;
        }
        return s;
    }
    static int binSearch(int target,int[] arr, int start, int end,boolean isCheck){
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target) return mid;
            if(isCheck){
                if(arr[mid]<target) start = mid+1;
                else end = mid-1;
            }else{
                if(arr[mid]>target) start = mid+1;
                else end = mid-1;
            }
        }
        return ans;
    }

}

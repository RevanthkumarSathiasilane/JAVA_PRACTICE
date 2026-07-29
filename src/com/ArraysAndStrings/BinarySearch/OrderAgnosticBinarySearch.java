package com.ArraysAndStrings.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
     // int[] arr = {-21,-16,-8,0,22,34,56,78,89,90,102,107};
        int[] arr = {107,90,78,56,34,22,0};
      int target = 107;
      System.out.println(orderAgnosticBS(arr,target));
    }
    //In which order is sorted!!
    static int orderAgnosticBS(int[] arr,int target){
        if(arr.length==0) return -1;
        int s = 0;
        int e = arr.length-1;
        boolean isAsc = arr[s]<arr[e];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target) return mid;
            if(isAsc) {
             if(arr[mid]<target) s = mid+1;
             else e = mid-1;
            }else{
                if(arr[mid]>target) s = mid+1;
                else e = mid-1;
            }
        }
        return 0;
    }

}

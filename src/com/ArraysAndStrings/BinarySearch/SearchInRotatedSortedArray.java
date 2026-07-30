package com.ArraysAndStrings.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(e>mid && arr[mid]>arr[mid+1]) return arr[mid];
            if(s<mid && arr[mid]<arr[mid-1]) return arr[mid-1];
            if(arr[s]>=arr[mid]) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}

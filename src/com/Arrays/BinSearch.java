package com.Arrays;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {29,18,9,0};
        int target = 18;
        int ans = binSearch(arr,target);
        System.out.println(ans);
    }
    static int binSearch(int[] a, int t){
        int s = 0;
        int e = a.length-1;
        boolean isAsc = (a[s]<a[e]);
        while(s<=e){
            int mid = s+(e-s)/2;
            if (a[mid]==t) return mid;
            if(isAsc){
               if(a[mid]<t) s=mid+1;
               else e = mid-1;
            }else{
                if(a[mid]<t) e = mid-1;
                else s = mid+1;
            }
        }
        return -1;
    }
}

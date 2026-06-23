package com.Recursion;

public class RotatedBinSearch {
    public static void main(String[] args) {
      int[] arr = {23,44,55,78,1,12,20};
        System.out.println(search(arr,78,0,arr.length-1));
    }
    static int search(int[] arr,int t,int s,int e){
        if(s>e) return -1;
        int m = s+(e-s)/2;
        if(arr[m]==t) return m;
        if(arr[s]<=arr[m]){
            if(t>=arr[s] && t<=arr[m]) return search(arr,t,s,m-1);
            else return search(arr,t,m+1,e);
        }
        if(t>=arr[m] && t<=arr[e]) return search(arr,t,m+1,e);
        return search(arr,t,s,m-1);
    }


}

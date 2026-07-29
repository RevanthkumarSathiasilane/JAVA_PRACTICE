package com.ArraysAndStrings.BinarySearch;
import java.util.*;
public class FirstAndLastOccurenceOfAElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = binSearch(nums,target,true);
        if(ans[0] != -1) ans[1] = binSearch(nums,target,false);
        return ans;
    }
    static int binSearch(int[] arr,int target,boolean checkSide){
      int s = 0;
      int ans = -1;
      int e = arr.length-1;
      while(s<=e){
          int mid = s+(e-s)/2;
          if(arr[mid]==target){
              ans = mid;
              if(checkSide) e=mid-1;
              else s = mid+1;
          }
          if(arr[mid]<target) s = mid+1;
          else e = mid-1;
      }
      return ans;
    }
}

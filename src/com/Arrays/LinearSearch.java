package com.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    //search in the array: return the index if item found
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int row = 0;row<arr.length;row++){
            //check for element at every index if it is ==target
            int element = arr[row];
            if(element == target){
                return row ;
            }
        }
        return -1;
    }
}

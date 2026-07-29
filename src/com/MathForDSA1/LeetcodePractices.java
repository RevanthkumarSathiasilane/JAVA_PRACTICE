package com.MathForDSA1;

public class LeetcodePractices {
    public static void main(String[] args) {
        int[] nums = {3,10,5,25,2,8};
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-i-1;j++){
                int change = nums[i]^nums[j];
                if(change>max) max = change;
            }
        }
        System.out.println(max);
    }
}

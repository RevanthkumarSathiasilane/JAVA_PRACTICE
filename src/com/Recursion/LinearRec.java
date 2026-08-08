package com.Recursion;
import java.util.*;
public class LinearRec{
    public static void main(String[] args) {
        int[] arr = {23,71,90,10};
        int target = 10;
        System.out.println(checkingTarget(arr,target,0));
    }
    static boolean checkingTarget(int[] arr,int target,int i){
        if(i==arr.length) return false;
        return arr[i]==target || checkingTarget(arr,target,i+1);
    }
}

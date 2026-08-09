package com.HexWare;
import java.util.*;
class MyException extends Exception{
    public MyException(String msg) {
        System.out.println(msg);
    }
}

public class MaxAmongMinInKSubArray {
    public static void main(String[] args) throws MyException{
        int[] arr = {1,2,3,1,2};
        int k = 7;
        ArrayList<Integer> list = new ArrayList<>();
        if (k > arr.length) {
            throw new MyException("Error of Input");
        }
        addMinOfSubArray(arr,list,0,k-1);
        System.out.println(Collections.max(list));
    }
    static ArrayList<Integer> addMinOfSubArray(int[] arr, ArrayList<Integer> list, int s, int e){
        if(e>=arr.length) return list;
        int min = Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            min = Math.min(min,arr[i]);
        }
        list.add(min);
        return addMinOfSubArray(arr,list,s+1,e+1);
    }

}

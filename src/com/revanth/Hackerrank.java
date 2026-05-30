package com.revanth;
import java.util.*;
public class Hackerrank {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        miniMaxSum(list);
        }
    static void miniMaxSum(List<Integer> arr) {
        int sum = 0;
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i:arr){
            sum+=i;
            if(i>largest) largest = i;
            if(i<smallest) smallest = i;
        }
        int max = sum-largest;
        int min = sum-smallest;
        System.out.println(max+" "+min);
    }
    }


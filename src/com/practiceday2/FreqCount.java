package com.practiceday2;
import java.util.*;
public class FreqCount {
    public static void main(String[] args){
         int[] arr = {2,1,3,1,1};
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int num : arr){
             if(map.containsKey(num)){
                 int count = map.get(num);
                 map.put(num,count+1);
             }
             map.put(num,1);
         }
        System.out.println(map);
    }
}

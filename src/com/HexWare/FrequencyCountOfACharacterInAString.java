package com.HexWare;
import java.util.*;
public class FrequencyCountOfACharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int[] temp = new int[256];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(temp[i]==0) continue;
            min = Math.min(min,temp[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(min==temp[arr[i]]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

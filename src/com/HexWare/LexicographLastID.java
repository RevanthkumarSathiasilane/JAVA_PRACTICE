package com.HexWare;
import java.util.*;
public class LexicographLastID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        System.out.println(maxString(arr));
    }
    static String maxString(char[] arr){
        String temp = "";
        TreeSet<String> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            temp = "";
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
                set.add(temp);
            }
        }
        return set.last();
    }
}

package com.HexWare;
import java.util.*;
public class ExtraEmailRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        System.out.println(arr.length-set.size());
    }
}

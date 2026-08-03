package com.HexWare;
import java.util.*;
public class RuleOfGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<size;i++){
            if(arr[i].length() % 2 == 1){
                max = Math.max(max,arr[i].length());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Better luck next time");
            return;
        }
        for(int i=0;i<size;i++){
            if(max == arr[i].length()){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

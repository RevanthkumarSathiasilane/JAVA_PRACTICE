package com.HexWare;
import java.util.*;
public class RohitSumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for(int l = i;l<=j;l++){
            sum+=l;
        }
        for(int l=j-1;l>=k;l--){
            sum+=l;
        }
        System.out.println(sum);
    }
}

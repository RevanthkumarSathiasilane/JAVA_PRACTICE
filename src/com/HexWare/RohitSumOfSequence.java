package com.HexWare;
import java.util.*;
public class RohitSumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
//        int sum = 0;
//        for(int l = i;l<=j;l++){
//            sum+=l;
//        }
//        for(int l=j-1;l>=k;l--){
//            sum+=l;
//        }
//        System.out.println(sum);
        float n,s1,s2;
        n = Math.abs(j-i)+1;
        s1 = (n/2)*(2*i+(n-1));
        n = Math.abs(k-(j-1))+1;
        s2 = (n/2)*(2*(j-1)-(n-1));
        System.out.println((int)(s1+s2));
    }
}

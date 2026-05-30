package com.practiceday1;
import java.util.*;
public class NoofFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i<=input){
            if(input%i==0) count++;
            i++;
        }
        System.out.println(count);
    }
}

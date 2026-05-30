package com.practiceday1;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        while(input!=0){
            int rem = input%10;
            sum+=rem;
            input/=10;
        }
        System.out.println(sum);
    }
}

package com.revanth;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = checkLargest(num1,num2,num3);
        System.out.println(largest);
    }
    static int checkLargest(int n1,int n2,int n3){
        int val = Math.max(n1,Math.max(n2,n3));
        return val;
    }
}

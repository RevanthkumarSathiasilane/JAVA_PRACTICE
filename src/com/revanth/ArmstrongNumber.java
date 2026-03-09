package com.revanth;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a armstring no or not!:");
        int enterNum = sc.nextInt();
        int temp = enterNum;
        boolean checkVal = isArmstrong(temp,enterNum);
        System.out.println(checkVal);
    }
    static boolean isArmstrong(int t,int enterNum){
        int finalVal=0;
        while(t>0){
            int rem = t%10;
            finalVal+=(rem*rem*rem);
            t/=10;
        }
        if(finalVal == enterNum) return true;
        return false;
    }
}

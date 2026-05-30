package com.practiceday1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int enterNum = sc.nextInt();
        int temp = enterNum;
        boolean checkVal = isArmstrong(temp, enterNum);
        System.out.println(checkVal);

    }

    static boolean isArmstrong(int t, int enterNum) {
        int finalVal = 0;
        while (t > 0) {
            int rem = t % 10;
            finalVal += (rem * rem * rem);
            t /= 10;
        }
        if (finalVal == enterNum) return true;
        return false;
    }
}

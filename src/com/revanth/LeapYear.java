package com.revanth;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        boolean isLeap = checkYear(year);
        System.out.println(isLeap);
    }
    static boolean checkYear(int y){
        if((y%4==0 && y%100!=0)||y%400==0) return true;
        return false;
    }
}

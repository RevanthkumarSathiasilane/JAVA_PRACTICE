package com.revanth;
import java.util.Scanner;
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd:");
        int checkNum = sc.nextInt();
        if((checkNum&1) !=1) System.out.println("Even");
        else System.out.println("Odd");
    }
}

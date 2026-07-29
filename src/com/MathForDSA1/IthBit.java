package com.MathForDSA1;

public class IthBit {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;
        System.out.println(n&(1<<(i-1)));
    }
}

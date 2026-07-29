package com.MathForDSA1;

public class ResetIthBit {
    public static void main(String[] args) {
        int n = 36;
        int i = 3;
        System.out.println(n&~(1<<(i-1)));
    }
}

package com.MathForDSA1;

public class rightMostSetBit {
    public static void main(String[] args) {
        int n = 18;
        int pos = 1;
        System.out.println(rightSetBitPosition(n,pos));
    }
    static int rightSetBitPosition(int n,int pos){
        while((n&1) == 0){
            n>>=1;
            pos++;
        }
        return pos;
    }
}

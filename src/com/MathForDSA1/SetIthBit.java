package com.MathForDSA1;

import com.sun.security.jgss.GSSUtil;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 36;
        int i=4;
        System.out.println(n|(1<<(i-1)));
    }
}

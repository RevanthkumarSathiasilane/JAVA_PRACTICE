package com.MathForDSA1;

public class FindUniqueNumbersFromOddTimes {
    public static void main(String[] args) {
        int[] arr = {3,5,5,4,3,3,5,4,2,4};
        System.out.println(uniqueNumber(arr));
    }
    static int uniqueNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int c = 0;
            for (int num : arr) {
                if (((num >> i) & 1) == 1) c++;
            }
            if (c % 3 != 0) ans |= (1 << i);
        }
        return ans;
    }
}

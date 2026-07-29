package com.MathForDSA1;

public class UniqueElementFromArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int unique = 0;
        for(int r : arr){
            unique^=r;
        }
        return unique;
    }

}

package com.ArraysAndStrings.BinarySearch;

public class RowAndColumnWiseSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(isTargetAppear(matrix,target));
    }
    static boolean isTargetAppear(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
    }
}

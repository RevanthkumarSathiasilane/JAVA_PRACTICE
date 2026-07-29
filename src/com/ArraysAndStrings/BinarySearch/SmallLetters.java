package com.ArraysAndStrings.BinarySearch;

public class SmallLetters {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'c';
        System.out.println(smallestLetters(letter,target));
    }
    static char smallestLetters(char[] letters, char target){
        int s = 0;
        int e = letters.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(letters[mid]<=target) s = mid+1;
            else e = mid-1;
        }
        return letters[s%letters.length];
    }
}

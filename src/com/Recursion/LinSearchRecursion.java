package com.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {8,9,1,4,7,7};
        System.out.println(linSearch(arr,4,0));
        System.out.println(linSearchIndex(arr,4,0));
        System.out.println(linSearchIndexLast(arr,4,arr.length-1));
        findAllIndex(arr,7,0);
        System.out.println(list);
        ArrayList<Integer> ans = findAllIndex1(arr,7,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndex2(arr,7,0));
    }
    static boolean linSearch(int[] arr,int t,int i){
        if(i==arr.length) return false;
        return arr[i] == t || linSearch(arr,t,i+1);
    }
    static int linSearchIndex(int[] arr,int t,int i){
        if(i==arr.length) return -1;
        if(arr[i]==t) return i;
        return linSearchIndex(arr,t,i+1);
    }
    static int linSearchIndexLast(int[] arr,int t,int i){
        if(i==-1) return -1;
        if(arr[i]==t) return i;
        return linSearchIndexLast(arr,t,i-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int t,int i){
        if(i==arr.length) return;
        if(arr[i]==t) list.add(i);
        findAllIndex(arr,t,i+1);
    }
    static ArrayList<Integer> findAllIndex1(int[] arr,int t,int i,ArrayList<Integer> list){
        if(i==arr.length) return list;
        if(arr[i]==t) list.add(i);
        return findAllIndex1(arr,t,i+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int t,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i] == t) list.add(i);
        ArrayList<Integer> ans = findAllIndex2(arr,t,i+1);
        list.addAll(ans);
        return list;
    }
}
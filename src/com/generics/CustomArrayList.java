package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){


        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public int remove(){//reducing only the size, not the data
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index]  = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
        for(int i=0;i<15;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}

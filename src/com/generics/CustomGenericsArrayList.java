package com.generics;

import java.util.Arrays;
import java.util.Scanner;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value;

    public CustomGenericsArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public T remove(){//reducing only the size, not the data
        T removed =(T)( data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
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
//        Scanner sc = new Scanner(System.in);
//        CustomGenericsArrayList list = new CustomGenericsArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        for(int i=0;i<15;i++){
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
        CustomGenericsArrayList<String> list1 = new CustomGenericsArrayList<>();
        list1.add("STring");
    }
}

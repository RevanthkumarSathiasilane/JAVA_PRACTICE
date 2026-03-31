package com.generics;

import java.util.*;

public class WildCardExample<T extends Number> {//here T should either be Number or its subclasses
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void getList(List<Number> l1){
        //do something
        // List<Number> l1 - here you can only pass numbers
        // List<? extends Number> l1 - here you can pass number and its Subclasses(float,double,etc..)
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
        WildCardExample<Number> list1 = new WildCardExample<>();
        list1.add(28);
    }
}

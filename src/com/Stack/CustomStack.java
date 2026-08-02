package com.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);//this calls the constructor with parameter;
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int d){
        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = d;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length-1;//ptr is at last index;
    }
    public boolean isEmpty(){
        return ptr == -1;//ptr is at last index;
    }
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);
        stack.push(20);
    }
}

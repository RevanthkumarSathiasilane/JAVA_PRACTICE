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
}

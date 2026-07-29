package com.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Stack{
    int[] arr;
    int top;
    public Stack(int size){
        arr = new int[size];
        top = -1;
    }
    void push(int data){
        if(top==arr.length-1){
            System.out.print("Stack Overflow");
            return;
        }
        arr[++top]=data;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped Element: "+arr[top--]);
    }
    void peek(){
        if(top==-1){
            System.out.print("Stack Underflow");
            return;
        }System.out.print("Peek Element: "+arr[top]);
    }
    void display(){
        System.out.print("Display Elements:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
public class BasicStackImplementation {
    public static void main(String[] args) {

        
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peek();
        stack.display();
    }
}

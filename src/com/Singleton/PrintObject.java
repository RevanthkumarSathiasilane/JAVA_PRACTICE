package com.Singleton;

public class PrintObject {
    public static void main(String[] args) {
        Single a = new Single();
        System.out.println(a);
    }
}
class Single{
    Single(){
        System.out.println("Object Created");
    }
}
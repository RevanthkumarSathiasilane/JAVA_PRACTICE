package com.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing1 = Singleton.getInstance();
    }
}

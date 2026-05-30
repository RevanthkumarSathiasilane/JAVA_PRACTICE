package com.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human revanth = new Human("Revanth",20);
       // Human twin = new Human(revanth);
        Human twin = (Human)revanth.clone();
        System.out.println(twin.name+" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(revanth.arr));
    }
}

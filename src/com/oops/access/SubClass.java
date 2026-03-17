package com.oops.access;
import java.lang.*;
public class SubClass extends A{
    public SubClass(int num,String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj  = new SubClass(45,"revanth");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }
}

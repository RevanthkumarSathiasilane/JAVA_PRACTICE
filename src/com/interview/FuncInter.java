package com.interview;
import java.util.*;
public class FuncInter {
    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(2,3,4,5,7);
      MathOperation addition = (a,b)-> a+b;
        System.out.println(addition.operation(4,5));

    }
}

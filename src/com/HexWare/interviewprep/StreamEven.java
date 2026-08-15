package com.HexWare.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(2,3,4,5,6,7,8,9,10)
        );
        int val =list.stream()
                .filter(x-> x%2==0)
                .reduce(0,Integer::sum);
             //   .forEach(System.out::println);
        System.out.println(val);
    }
}

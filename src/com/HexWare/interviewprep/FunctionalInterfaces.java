package com.HexWare.interviewprep;


public class FunctionalInterfaces {
    public static void main(String[] args) {
        Calculator cal = (a,b) -> a+b;
        System.out.println(cal.add(10,20));
    }
}

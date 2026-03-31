package com.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student revanth = new Student(44,8.88f);
        Student deepz = new Student(12,9.60f);

        if(revanth.compareTo(deepz) < 0) {
            System.out.println("Deepz has more marks");
        }


    }
}

package com.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student revanth = new Student(44,89.76f);
        Student deepz = new Student(12,99.52f);
        Student karan = new Student(2,95.52f);
        Student praveen = new Student(3,77.52f);
        Student murgesh = new Student(9,96.52f);

        Student[] list = {revanth,deepz,karan,praveen,murgesh};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(list,(o1,o2)-> -(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

//        if(revanth.compareTo(deepz) < 0) {
//            System.out.println("Deepz has more marks");
//        }


    }
}

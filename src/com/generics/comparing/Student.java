package com.generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+"";
    }

    @Override
    public int compareTo(@NotNull Student o) {
        int diff = (int)(this.marks) - (int) (o.marks);
        //if diff == 0 : means both are equal
        //if diff < 0 : means o.marks is high else: this.marks is high
        return diff;
    }
}

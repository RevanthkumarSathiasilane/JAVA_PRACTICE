package com.practiceday2;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {
    String empId;
    String name;
    int experienceYears;
    double salary;
    public Employee(String empId,String name,int experienceYears,double salary){
        this.empId = empId;
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee e) {
        // Experience descending
        int exp =
                e.experienceYears - this.experienceYears;

        if(exp != 0) {
            return exp;
        }

        // Salary descending
        int sal =
                (int)(e.salary - this.salary);

        if(sal != 0) {
            return sal;
        }

        // empId ascending
        return this.empId.compareTo(e.empId);
    }

    void display() {
        System.out.println(
                empId + " " +
                        name + " " +
                        experienceYears + " " +
                        salary
        );
    }
}

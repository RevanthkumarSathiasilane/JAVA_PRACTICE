package com.revanth.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
   static long population;

   static void message(){
       System.out.println("hello World!!");
       System.out.println(this.age);
   }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;

        Human.message();
    }
}
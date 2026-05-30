package com.practiceday2;

public class Compare {
    public static void main(String[] args) {
      Employee emp1 = new Employee("E102","Arun",5,75000.50);
      Employee emp2 = new Employee("E101","Vikram",3,82000.00);
      Employee emp3 = new Employee("E103","Kiran",7,68000.75);
      Employee temp;

        if(emp1.compareTo(emp2) > 0) {
            temp = emp1;
            emp1 = emp2;
            emp2 = temp;
        }

        if(emp1.compareTo(emp3) > 0) {
            temp = emp1;
            emp1 = emp3;
            emp3 = temp;
        }

        if(emp2.compareTo(emp3) > 0) {
            temp = emp2;
            emp2 = emp3;
            emp3 = temp;
        }

        System.out.println("Sorted Order:");

        emp1.display();
        emp2.display();
        emp3.display();

    }
}

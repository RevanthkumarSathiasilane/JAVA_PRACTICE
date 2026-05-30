package com.enumExamples;

public class Basic {
    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        // each thing is public,static and final
        //since its final you can create child enums
        // type is Week
        Week(){
            System.out.println("Constructor called for "+this);
        }

        @Override
        public void hello() {
            System.out.println("Hi, how are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;//output:Monday

//        for(Week day:Week.values()){//output : Monday to Sunday
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());//output:0
        week.hello();
    }
}

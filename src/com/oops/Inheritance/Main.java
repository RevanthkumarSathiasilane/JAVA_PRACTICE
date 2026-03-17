package com.oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b  = new Box(4.6,7.9, 9.9);
        Box b2 = new Box(b);
        //System.out.println(b.width+" "+b.height);

//        BoxWeight box3 = new BoxWeight() ;
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box3.height+" "+box3.width+" "+box3.length+" "+box3.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.width);
        //there are many variable in both parent and child classes
        //you are given access to variable that are in the ref.type i.e. BoxWeight;
        //hence, you should have access to weight variable
        //this also means, that the ones you are trying to access should be initialized
        //but here, when the object itself is of type parent class, how will you call the constructor of the child class
//        BoxWeight b6 = new Box(2,3,4);
//        System.out.println(b6);

       // BoxPrice box = new BoxPrice(5,8, 200);

        //Box.greeting();
        Box box = new BoxWeight();
        box.greeting();


    }
}

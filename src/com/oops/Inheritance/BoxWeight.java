package com.oops.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    //@Override
    static void greeting(){
        System.out.println("I am in static method of BoxWeight class");
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double length, double height, double width, double weight) {

        super(length, height, width);//what is this? call the parent class constructor
        //used to initialize values present in parent class
        System.out.println(super.width);
        this.weight = weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}

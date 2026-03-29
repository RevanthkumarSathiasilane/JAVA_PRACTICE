package oops.Inheritance;

public class Box {
    private double length;
    double height;
    double width;
  //  double weight;
    Box(){
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }
    static void greeting(){
        System.out.println("I am in static method of Box class");
    }
    //cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double length, double height, double width) {
        System.out.println("Box class Constructor");
        this.length = length;
        this.height = height;
        this.width = width;
    }
    //copyOf constructor
    Box(Box b){
        this.height = b.height;
        this.length = b.length;
        this.width = b.width;
    }
    public void information(){
        System.out.println("Running the box!!");
    }
}

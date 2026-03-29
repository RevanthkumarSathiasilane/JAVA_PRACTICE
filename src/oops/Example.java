package oops;
import oops.access.A;
public class Example {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
// all three ref variables are pointing to just one object
        A a = new A(24,"Kunal");
        //;


    }
}

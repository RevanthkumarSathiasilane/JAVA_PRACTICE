package oops.interfaces.extendDemo2.extendDemo;

public interface A {
    static void greeting(){
        System.out.println("Hey I am a static method");
    }// can't create like this : static void method();//error
    default void fun(){
        System.out.println("I am in A");
    }
}

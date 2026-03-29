package oops.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine accelerate");
    }
}

package oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.accelerate();
//        car.start();
//        car.stop();
//        MediaPlayer carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}



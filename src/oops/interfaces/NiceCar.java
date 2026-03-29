package oops.interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player = new CDPlayer();
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

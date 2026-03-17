package com.oops.interfaces;

public interface Engine {

    static final int PRICE =78_000;//defaultly static and final variable so no need to create

    void start();
    void stop();
    void accelerate();
}

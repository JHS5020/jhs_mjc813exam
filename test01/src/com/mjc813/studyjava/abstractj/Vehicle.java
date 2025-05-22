package com.mjc813.studyjava.abstractj;

public abstract class Vehicle {
    protected int wheelCount;


    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public abstract void move();
    public abstract void stop();
}

package com.mjc813.studyjava.abstractj;

public class Bicycle extends Vehicle {
    protected String name;

    public Bicycle(String name, int wheelCount) {
        super(wheelCount);
        this.name = name;
    }
    @Override
    public void move() {
        System.out.print(super.wheelCount+"개의 바퀴의 "+this.name+"을 운전한다.");
    }
    @Override
    public void stop(){
        System.out.println(this.name+"을 정지한다.");
    }
}

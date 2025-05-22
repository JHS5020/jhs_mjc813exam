package com.mjc813.studyjava.abstractj;

public class Truck extends Vehicle {
    protected String name;
    protected int ton;


    public Truck(String name, int ton,int wheelCount) {
        super(wheelCount);
        this.name = name;
        this.ton = ton;
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

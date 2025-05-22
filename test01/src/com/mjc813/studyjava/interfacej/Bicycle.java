package com.mjc813.studyjava.interfacej;

public class Bicycle implements IBicycle{
    protected String name;
    protected int wheelCount;
    public Bicycle(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }
    @Override
    public String drive() {
        return(this.wheelCount + "개의 바퀴의 " + this.name+"을 운전한다.");
    }
    @Override
    public String breakk(){
        return this.name+"을 정지한다";
    }
}

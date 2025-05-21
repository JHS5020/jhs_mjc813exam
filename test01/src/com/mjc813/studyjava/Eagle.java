package com.mjc813.studyjava;

public class Eagle extends Bird{
    public Eagle(String name, int age,String wings) {
        super(name, age);
        super.wings = wings;
    }
    @Override
    public void fly() {
        System.out.printf("%s %s 높이 난다.",super.name,super.wings);
    }
    @Override
    public void eat(Object feed) {
        if (feed instanceof Animal) {
            System.out.println(super.name + "은 " + feed + "를 먹는다.");
        }
    }
    @Override
    Animal reproduce(String newName) {
        return new Eagle(newName,0, super.wings);
    }
}

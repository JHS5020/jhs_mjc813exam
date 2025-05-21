package com.mjc813.studyjava;

public class Mammalia extends Animal{

    Mammalia(String name, int age) {
        super(name, age);
    }
    public void feedingMilk(){
        System.out.printf("%s 젖을 먹인다.",super.name);
    }
    @Override
    public void eat(Object feed) {
        if(feed instanceof String){
            System.out.println(super.name + "은 " + feed+"를 먹는다.");
        }
    }
    @Override
    Animal reproduce(String newName) {
        return new Mammalia(newName, 0);
    }
}

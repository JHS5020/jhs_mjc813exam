package com.mjc813.studyjava;

public class Carnivore extends Mammalia {

    Carnivore(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(Object feed) {
        if (feed instanceof Herbivore) {
            System.out.println(super.name + "은 " + feed + "를 먹는다.");
        }
    }
    @Override
    Animal reproduce(String newName) {
        return new Carnivore(newName, 0);
    }
}

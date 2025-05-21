package com.mjc813.studyjava;

public class Parrot extends Bird{

    public Parrot(String name, int age,String wings) {
        super(name, age);
        super.wings = wings;
    }
    @Override
    public void fly(){
        System.out.printf("%s %s 조금만 난다.",super.name,super.wings);
    }
    @Override
    public void eat(Object feed) {
        if(feed instanceof String){
            System.out.println(super.name + "은 " + feed+"를 먹는다.");
        }
    }

    @Override
    Animal reproduce(String newName) {
        return new Parrot(newName, 0, super.wings);
    }
}

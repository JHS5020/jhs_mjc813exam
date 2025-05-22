package com.mjc813.studyjava;

public class Eagle extends Bird{
    public Eagle(String name, int age,String wings) {
        super(name, age);
        super.wings = wings;
    }
    @Override
    public void fly() {
        System.out.printf("%s %s 높이 난다.\n",super.name,super.wings);
    }
    @Override
    public void eat(Object feed) {
        if (feed instanceof Animal) {
            System.out.println(super.name + "이(가) " + ((Animal) feed).name + "을(를) 먹는다.");
        }
    }
    @Override
    Animal reproduce(String newName){
        Eagle newAnimal = new Eagle(newName,0,this.wings);
        System.out.println(this.name + "이(가) "+ newAnimal.name+"("+newAnimal.age +")" + "을(를) 낳았습니다");
        return newAnimal;
    }
    public static void main(String[] args) {
        Eagle q = new Eagle("독수리", 24,"(독수리 날개)");
        q.fly();
        q.eat(new Animal("쥐",2));
        q.reproduce("독수리1");
    }
}

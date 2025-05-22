package com.mjc813.studyjava;

public class Parrot extends Bird{

    public Parrot(String name, int age,String wings) {
        super(name, age);
        super.wings = wings;
    }
    @Override
    public void fly(){
        System.out.printf("%s는 %s로 조금만 난다.\n",super.name,super.wings);
    }
    @Override
    public void eat(Object feed) {
        if(feed instanceof String){
            System.out.println(super.name + "은(는) " + feed+"을(를) 먹는다.");
        }
    }

    @Override
    Animal reproduce(String newName){
        Parrot newAnimal = new Parrot(newName,0,this.wings);
        System.out.println(this.name + "이(가) "+ newAnimal.name+"("+newAnimal.age +")" + "을(를) 낳았습니다");
        return newAnimal;
    }
    public static void main(String[] args) {
        Parrot e = new Parrot("앵무새", 24,"(앵무새 날개)");
        e.fly();
        e.eat("씨앗");
        e.reproduce("앵무새1");
    }
}

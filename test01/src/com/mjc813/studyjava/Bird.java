package com.mjc813.studyjava;

public class Bird extends Animal{
    protected String wings = "날개";

    Bird(String name, int age) {
        super(name, age);
    }
    public void flap(){
        System.out.printf("%s %s 날개짓한다.\n",super.name,this.wings);
    }
    public void fly(){
        System.out.printf("%s %s 난다.\n",super.name,this.wings);
    }
    Animal reproduce(String newName){
        Bird newAnimal = new Bird(newName,0);
        System.out.println(this.name + "이 "+ newAnimal.name+"("+newAnimal.age +")" + "을 낳았습니다");
        return newAnimal;
    }
    public static void main(String[] args) {
        Bird e = new Bird("새", 2);
        e.fly();
        e.flap();
        e.reproduce("새1");
    }
}

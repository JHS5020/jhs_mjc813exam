package com.mjc813.studyjava;

public class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(Object feed) {
        System.out.println(this.name + "은 " + feed+"를 먹는다.");
    }
    public void sleep() {
        System.out.printf("%s 잔다\n",this.name);
    }
    public void move(){
        System.out.printf("%s 이동한다\n",this.name);
    }
    Animal reproduce(String newName){
        Animal newAnimal = new Animal(newName,0);
        System.out.println(this.name + "이 "+ newAnimal.name + "("+newAnimal.age +")" + "을 낳았습니다");
        return newAnimal;
    }
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 5);
        animal.eat("곡식");
        animal.sleep();
        animal.move();
        animal.reproduce("동물1");
        animal.reproduce("동물2");
    }
}

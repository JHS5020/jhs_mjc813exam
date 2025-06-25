package com.mjc.studyjava.d06_19;

public class Main710 {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer :: staticMethod);

        Computer com = new Computer();
        person.action(com :: instanceMethod);
    }
}

package com.mjc.studyjava;

public class Computer {
    String name;
    String cpu;
    String ram;
    String storage;
    String graphic;

    public Computer(String name,String cpu, String ram, String storage, String graphic) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphic = graphic;
    }
    public void booting(){
        System.out.println(this.name + "이 부팅되었습니다.");
    }
    public void myComputer(){
        System.out.println("CPU : " + this.cpu);
        System.out.println("RAM : " + this.ram);
        System.out.println("Storage : " + this.storage);
        System.out.println("Graphic : " + this.graphic);
    }
    public void shutdown(){
        System.out.println(this.name + "이 종료되었습니다.\n");
    }
}

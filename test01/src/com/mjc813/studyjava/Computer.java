package com.mjc813.studyjava;

public class Computer{
    private String name;
    private String cpu;
    private String ram;
    private String storage;
    private String graphic;
    private Mouse mouse = new Mouse();


    public Computer(String name){
        this(name,null,null,null,null);
    }
    public Computer(String name,String cpu){
        this(name,cpu,null,null,null);
    }
    public Computer(String name,String cpu, String ram){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }
    public Computer(String name,String cpu, String ram, String storage){
        this(name,cpu,ram,storage,null);
    }
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
        if(cpu == null){
            System.out.println("CPU :  조립중입니다");
        }
        else{
            System.out.println("CPU : " + this.cpu);
        }
        if(ram == null){
            System.out.println("RAM :  조립중입니다");
        }
        else{
            System.out.println("RAM : " + this.ram);
        }
        if(storage == null){
            System.out.println("Storage :  조립중입니다");
        }
        else{
            System.out.println("Storage : " + this.storage);
        }
        if(graphic == null){
            System.out.println("Graphic :  조립중입니다");
        }
        else{
            System.out.println("Graphic : " + this.graphic);
        }
    }
    public void shutdown(){
        System.out.println(this.name + "이 종료되었습니다.\n");
    }

    public void clickMouseLeftButton(int x, int y){
        mouse.moveMouse(x, y);
        mouse.leftClick();
    }
    public void clickMouseRightButton(int x, int y){
        mouse.moveMouse(x, y);
        mouse.rightClick();
    }
}

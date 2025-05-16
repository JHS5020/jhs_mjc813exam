package com.mjc813.studyjava;

public class Computer{
    private String name = null;
    private String cpu = null;
    private String ram = null;
    private String storage = null;
    private String graphic = null;
    private Mouse mouse = new Mouse();



    public Computer(String name){
        this(name,null,null,null,null);
    }
    public Computer(String name,String cpu){
        this(name,cpu,null,null,null);
    }
    public Computer(String name,String cpu, String ram){
        this(name,cpu,ram,null,null);
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
            cpu = "조립중입니다";
        }
        if(ram == null){
            ram = "조립중입니다";
        }
        if(storage == null){
            storage = "조립중입니다";
        }
        if(graphic == null){
            graphic = "조립중입니다";
        }
        System.out.println("CPU : " + this.cpu);
        System.out.println("RAM : " + this.ram);
        System.out.println("Storage : " + this.storage);
        System.out.println("Graphic : " + this.graphic);
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

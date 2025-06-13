package com.mjc813.studyjava;


import java.util.Comparator;

public class Computer implements Comparable<Computer>, Comparator<Computer> {
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
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Computer){
            if(this.cpu.equals(((Computer) obj).cpu)
            && this.ram.equals(((Computer) obj).ram)
            && this.storage.equals(((Computer) obj).storage)
            && this.graphic.equals(((Computer) obj).graphic)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "이름: " + this.name + "\nCpu: "+this.cpu + "\nRam: "+this.ram
                + "\nStorage: "+this.storage + "\nGraphic: "+this.graphic;
    }
    @Override
    public int compareTo(Computer o) {
        if(this.cpu.compareTo(o.cpu) > 0) return 1;
        else if(this.cpu.compareTo(o.cpu) == 0) return 0;
        else return -1;
    }
    @Override
    public int compare(Computer o1, Computer o2) {
        if(o1.ram.compareTo(o2.ram) > 0) return 1;
        else if(o1.ram.compareTo(o2.ram) == 0) return 0;
        else return -1;
    }

    public void booting(){
        System.out.println(this.name + "이 부팅되었습니다.");
    }
    public void myComputer(){
        if(this.cpu == null){
            System.out.println("CPU :  조립중입니다");
        }
        else{
            System.out.println("CPU : " + this.cpu);
        }
        if(this.ram == null){
            System.out.println("RAM :  조립중입니다");
        }
        else{
            System.out.println("RAM : " + this.ram);
        }
        if(this.storage == null){
            System.out.println("Storage :  조립중입니다");
        }
        else{
            System.out.println("Storage : " + this.storage);
        }
        if(this.graphic == null){
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
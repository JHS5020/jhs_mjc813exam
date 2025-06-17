package com.mjc.studyjava.d06_17;


import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Getter
@Setter
public class Computer implements Comparable<Computer>, Comparator<Computer> {
    private String name;
    private String cpu;
    private String ram;
    private String storage;
    private String graphic;
    private Integer price;
    private Integer qty;
    private Mouse mouse = new Mouse();

    public List<Computer> computers = new ArrayList<>();



    public Computer(String name){
        this(name,null,null,null,null,null,null);
    }
    public Computer(String name,String cpu){
        this(name,cpu,null,null,null,null,null);
    }
    public Computer(String name,String cpu, String ram){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }
    public Computer(String name,String cpu, String ram, String storage){
        this(name,cpu,ram,storage,null,null,null);
    }
    public Computer(String name,String cpu, String ram, String storage, String graphic) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphic = graphic;
    }
    public Computer(String name,String cpu, String ram, String storage, String graphic, Integer price, Integer qty) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphic = graphic;
        this.price = price;
        this.qty = qty;
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

    public static void computerStreamExample() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("c1","Gen9_i3","4GB","SSD 500 GB","RTX2060",50,2));
        computers.add(new Computer("c2","Gen9_i5","8GB","HDD 500 GB","RTX2070",200,3));
        computers.add(new Computer("c3","Gen9_i7","16GB","SSD 1000 GB","RTX3060",400,4));
        computers.add(new Computer("c4","Gen9_i9","32GB","HDD 1000 GB","RTX3070",500,5));
        computers.add(new Computer("c5","Gen9_i11","64GB","SSD 2000 GB","RTX4060",700,6));
        computers.add(new Computer("c6","Gen9_i3","64GB","SSD 2000 GB","RTX4060",700,10));

        int sum = computers.stream()
                .mapToInt(p -> p.price * p.qty)
                .sum();
        System.out.println("모든 종류 컴퓨터의 재고 가격의 합 : " +sum);
        int qty = computers.stream()
                .filter(p -> p.cpu.equals("Gen9_i3"))
                .mapToInt(p -> p.qty)
                .sum();
        System.out.println("가장 성능이 낮은 cpu의 재고 수 : " + qty);
    }
}
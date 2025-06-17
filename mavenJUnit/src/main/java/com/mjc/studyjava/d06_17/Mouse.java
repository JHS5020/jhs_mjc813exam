package com.mjc.studyjava.d06_17;

public class Mouse {
    private int pointx;
    private int pointy;

    public void leftClick(){
        System.out.println("마우스("+this.pointx+","+this.pointy+")  왼쪽버튼 클릭됨");
    }
    public void rightClick(){
        System.out.println("마우스("+this.pointx+","+this.pointy+")  오른쪽버튼 클릭됨");
    }
    public void moveMouse(int x, int y){
        this.pointx = x;
        this.pointy = y;
    }
}

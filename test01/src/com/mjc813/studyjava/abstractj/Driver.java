package com.mjc813.studyjava.abstractj;

public class Driver {
    private String name;
    private int age;
    private Vehicle vehicle;

    public Driver(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }
    public void drive() {
        if(this.vehicle instanceof Truck) {
            System.out.println(this.name + "은 "+((Truck) this.vehicle).wheelCount + "개의 바퀴의 " +((Truck) this.vehicle).name+"을 운전합니다");
        }
        else if(this.vehicle instanceof Bicycle) {
            System.out.println(this.name + "는 "+((Bicycle) this.vehicle).wheelCount+"개의 바퀴의 " +((Bicycle) this.vehicle).name+"을 운전합니다");
        }
    }
    public void breakk() {
        if(this.vehicle instanceof Truck) {
            System.out.println(this.name + "은 "+((Truck) this.vehicle).name+"을 정지합니다");
        }
        else if(this.vehicle instanceof Bicycle) {
            System.out.println(this.name + "는 "+((Bicycle) this.vehicle).name+"을 정지합니다");
        }
    }
    public static void c(Vehicle vehicle){
        vehicle.move();
        vehicle.stop();
    }
    public static void main(String[] args) {
        Truck truck = new Truck("트럭",2,8);
        Bicycle bicycle = new Bicycle("자전거",2);
        Driver driver1 = new Driver("사람1",30,truck);
        driver1.drive();
        driver1.breakk();
        Driver driver2 = new Driver("사람2",17,bicycle);
        driver2.drive();
        driver2.breakk();
    }
}

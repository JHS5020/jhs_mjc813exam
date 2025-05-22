package com.mjc813.studyjava.interfacej;


public class Driver {
    private String name;
    private int age;
    private IVehicle Ivehicle;

    public Driver(String name, int age, IVehicle Ivehicle) {
        this.name = name;
        this.age = age;
        this.Ivehicle = Ivehicle;
    }
    public void drive() {
        if(this.Ivehicle instanceof Truck) {
            System.out.println(this.name + "은 "+((Truck) this.Ivehicle).wheelCount + "개의 바퀴의 " +((Truck) this.Ivehicle).name+"을 운전합니다");
        }
        else if(this.Ivehicle instanceof Bicycle) {
            System.out.println(this.name + "는 "+((Bicycle) this.Ivehicle).wheelCount+"개의 바퀴의 " +((Bicycle) this.Ivehicle).name+"을 운전합니다");
        }
    }
    public void breakk() {
        if(this.Ivehicle instanceof Truck) {
            System.out.println(this.name + "은 "+((Truck) this.Ivehicle).name+"을 정지합니다");
        }
        else if(this.Ivehicle instanceof Bicycle) {
            System.out.println(this.name + "는 "+((Bicycle) this.Ivehicle).name+"을 정지합니다");
        }
    }
    public static void main(String[] args) {
        Truck truck = new Truck("트럭1",10);
        Bicycle bicycle = new Bicycle("자전거1",2);
        Driver driver1 = new Driver("운전사1",30,truck);
        Driver driver2 = new Driver("운전사2",35,bicycle);
        driver1.drive();
        driver2.drive();
        driver1.breakk();
        driver2.breakk();
    }
}

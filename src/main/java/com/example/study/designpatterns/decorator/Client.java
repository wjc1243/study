package com.example.study.designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("------------------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("------------------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();
        System.out.println("------------------");
        WaterCar waterCar1 = new WaterCar(new FlyCar(new Car()));
        waterCar1.move();
    }
}

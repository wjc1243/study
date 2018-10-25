package com.example.study.designpatterns.factory.factorymethd;

public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiCarFactory().createCar();
        Car c2 = new BenzCarFactory().createCar();
        c1.run();
        c2.run();

        Car c3 = new BmwCarFactory().createCar();
        c3.run();
    }
}

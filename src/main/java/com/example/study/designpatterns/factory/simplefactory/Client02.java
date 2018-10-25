package com.example.study.designpatterns.factory.simplefactory;

/**
 * 简单工厂模式情况
 */
public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("audi");
        Car c2 = CarFactory.createCar("benz");
        c1.run();
        c2.run();

        Car c3 = CarFactory2.createAudi();
        Car c4 = CarFactory2.createBenz();
        c3.run();
        c4.run();
    }
}

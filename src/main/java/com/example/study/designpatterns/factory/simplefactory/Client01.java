package com.example.study.designpatterns.factory.simplefactory;

/**
 * 没有工厂模式情况
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Benz();

        c1.run();
        c2.run();
    }
}

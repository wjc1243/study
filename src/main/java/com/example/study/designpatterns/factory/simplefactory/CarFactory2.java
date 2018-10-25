package com.example.study.designpatterns.factory.simplefactory;

/**
 * 简单工厂模式
 */
public class CarFactory2 {
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createBenz(){
        return new Benz();
    }
}

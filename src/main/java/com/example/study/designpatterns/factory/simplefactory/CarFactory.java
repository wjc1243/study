package com.example.study.designpatterns.factory.simplefactory;

/**
 * 简单工厂模式
 */
public class CarFactory {
    public static Car createCar(String type){
        if("audi".equals(type)){
            return new Audi();
        }
        if("benz".equals(type)){
            return new Benz();
        }
        return null;
    }
}

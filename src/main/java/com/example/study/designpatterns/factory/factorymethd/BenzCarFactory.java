package com.example.study.designpatterns.factory.factorymethd;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}

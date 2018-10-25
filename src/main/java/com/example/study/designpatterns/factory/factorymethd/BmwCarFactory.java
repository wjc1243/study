package com.example.study.designpatterns.factory.factorymethd;

public class BmwCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}

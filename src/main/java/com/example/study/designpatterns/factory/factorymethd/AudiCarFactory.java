package com.example.study.designpatterns.factory.factorymethd;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

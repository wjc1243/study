package com.example.study.designpatterns.Strategy;

public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double money) {
        return money*0.8;
    }
}

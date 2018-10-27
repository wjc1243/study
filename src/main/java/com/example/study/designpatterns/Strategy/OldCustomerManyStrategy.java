package com.example.study.designpatterns.Strategy;

public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double money) {
        return money*0.7;
    }
}

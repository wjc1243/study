package com.example.study.designpatterns.Strategy;

public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double money) {
        return money*0.9;
    }
}

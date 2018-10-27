package com.example.study.designpatterns.Strategy;

public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double money) {
        return money;
    }
}

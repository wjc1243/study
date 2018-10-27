package com.example.study.designpatterns.Strategy;

public class Content {
    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double d){
        System.out.println(strategy.getPrice(d));
    }
}

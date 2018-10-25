package com.example.study.designpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        Computer c1 = new Laptop(new Lenovo());
        c1.sale();

        Computer c2 = new Pad(new Shenzhou());
        c2.sale();
    }
}
